package org.xtext.ui;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.xtext.impl.RuleCallImpl;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;
import org.xtext.abs.Delta_decl;
import org.xtext.abs.Feature;
import org.xtext.abs.Feature_decl;
import org.xtext.abs.impl.Delta_declImpl;
import org.xtext.abs.impl.FeatureImpl;
import org.xtext.abs.impl.Feature_declImpl;
import org.xtext.abs.ui.views.FeatureDeltaView;
import org.xtext.generator.AbsGenerator;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import com.google.inject.Inject;

public class MyHyperLinkHelper extends HyperlinkHelper {
	@Inject AbsGenerator generator;
	public static final String ID = "org.xtext.ui.MyHyperLinkHelper";

	@Inject IWorkbench workbench;

	//private TableViewer viewer;

	//@Override
	//public void createHyperlinksByOffset(XtextResource resource, int offset,IHyperlinkAcceptor acceptor) {
	//	super.createHyperlinksByOffset(resource, offset, acceptor);
	//	System.out.println("Inside MyHyperLinkHelper");
	//}



	@Override
	public void createHyperlinksByOffset(XtextResource resource, int offset,IHyperlinkAcceptor acceptor) {


		EObjectAtOffsetHelper eObjectAtOffsetHelper = new EObjectAtOffsetHelper();
		EObject eObject = eObjectAtOffsetHelper.resolveElementAt(resource, offset);

		if(eObject instanceof Delta_decl) {
			try {

				//PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("org.xtext.abs.plugin.console.MsgConsole");
				FeatureDeltaView viewer = (FeatureDeltaView)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("org.xtext.abs.ui.views.FeatureDeltaView");
				//out.print(viewer.getTitle());
				ArrayList<Object> elements= generator.computeDeltaToFeature((Delta_decl)eObject);
				viewer.removeOldContent();
				for( Object feature: elements) {
					//	FeatureImpl feature_declImpl =((EObjectContainmentEList<FeatureImpl>)feature).get(0);
					Feature_declImpl feature_declImpl = (Feature_declImpl) ((FeatureImpl)feature).getFeature_decl();
					String featureName = feature_declImpl.getName().replaceAll(" ","").replaceAll("\n","");
					if (resource == null)
						return;
					XtextResource featureResource = ((XtextResource)feature_declImpl.eResource());
					INode root = featureResource.getParseResult().getRootNode();
					BidiTreeIterator<INode> it = root.getAsTreeIterable().iterator();
					Map<INode,XtextResource> nodeAndResourceMap = new HashMap<>();
					while(it.hasNext())
					{
						INode node = it.next();
						String nodeName= node.getText();

						if (((nodeName).equals(featureName))) {// && (node.getGrammarElement() instanceof RuleCallImpl)) {
							if(nodeAndResourceMap.get(node)==null) {
								nodeAndResourceMap.put(node, featureResource);
								viewer.updateContent(nodeAndResourceMap);	
								//break;
							}

						}
					}

				}

			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//out.print("Error no view found");
			}

		}

		if(eObject instanceof Feature_decl) {
			try {
				FeatureDeltaView viewer = (FeatureDeltaView)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("org.xtext.abs.ui.views.FeatureDeltaView");
				ArrayList<Object> elements= generator.computeFeatureToDelta((Feature_decl)eObject);
				viewer.removeOldContent();
				if(elements != null) {
					for( Object deltaDecl: elements) {
						Delta_declImpl delta_declImpl =((Delta_declImpl)deltaDecl);

						String deltaName = delta_declImpl.getName().replaceAll(" ","").replaceAll("\n","");
						if (resource == null)
							return;
						XtextResource featureResource = ((XtextResource)delta_declImpl.eResource());
						INode root = featureResource.getParseResult().getRootNode();
						BidiTreeIterator<INode> it = root.getAsTreeIterable().iterator();
						Map<INode,XtextResource> nodeAndResourceMap = new HashMap<>();
						while(it.hasNext())
						{
							INode node = it.next();
							String nodeName= node.getText();
							if (((nodeName).equals(deltaName)) && (node.getGrammarElement() instanceof RuleCallImpl)) {
								nodeAndResourceMap.put(node, featureResource);
								viewer.updateContent(nodeAndResourceMap);	
								break;
							}
						}

					}
				}

			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//out.print("Error no view found");
			}


		}


	}


}
