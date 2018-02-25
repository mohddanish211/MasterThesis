package org.xtext.ui;

import java.net.URI;
import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IHyperlink;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.console.TextConsole;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ListDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.xtext.nodemodel.BidiTreeIterable;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.CompositeNode;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;
import org.eclipse.xtext.ui.editor.hyperlinking.XtextHyperlink;
import org.xtext.abs.Delta_decl;
import org.xtext.abs.Feature;
import org.xtext.abs.Feature_decl;
import org.xtext.abs.Productline_decl;
import org.xtext.abs.impl.FeatureImpl;
import org.xtext.abs.ui.views.FeatureDeltaView;
import org.xtext.generator.AbsGenerator;

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
		MessageConsole myConsole = findConsole("myConsole");
		MessageConsoleStream out = myConsole.newMessageStream();

		if(eObject instanceof Delta_decl) {
			Display display = Display.getCurrent();
			Shell shell = new Shell(display);
			out.println("Running!!");
			//
			// Create the help context id for the viewer's control
			//workbench.getHelpSystem().setHelp(viewer.getControl(), "org.xtext.Abs.ui.viewer");
			//workbenchPart.getSite().setSelectionProvider(viewer);
			try {
				FeatureDeltaView viewer = (FeatureDeltaView)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("org.xtext.abs.ui.views.FeatureDeltaView");
				out.print(viewer.getTitle());
				ArrayList<Feature> elements= generator.compile2((Delta_decl)eObject);
				viewer.removeOldContent();
				for( Object feature: elements) {
					String featureName = (((FeatureImpl)feature).getName()).replaceAll(" ","");;
					if (resource == null)
						return;
					XtextResource featureResource = ((XtextResource)((FeatureImpl) feature).eResource());
					INode root = featureResource.getParseResult().getRootNode();
					BidiTreeIterator<INode> it = root.getAsTreeIterable().iterator();
					while(it.hasNext())
					{
						INode node = it.next();
						String nodeName= node.getText();
						//nodeName=(nodeName).replaceAll(" ","");
						if (node instanceof CompositeNodeWithSemanticElement && (nodeName).equals(featureName)) {
							System.out.println(node.getText()+"::"+node.getOffset()+"::");
							System.out.println("------------------");
							viewer.updateContent(node);	
						}else {
							System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
							System.out.println(node.getText());
							System.out.println(featureName);
						}
					}
					

				}
				//viewer.hookDoubleClickAction();
				//open editor PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				out.print("Error no view found");
			}

		}




	}


	public MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		//no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[]{myConsole});
		return myConsole;
	}



}
