package org.xtext.ui;

import java.net.URI;

import org.eclipse.debug.internal.ui.views.memory.renderings.CreateRendering;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Region;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IHyperlink;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.console.TextConsole;
import org.eclipse.xtext.nodemodel.impl.CompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;
import org.eclipse.xtext.ui.editor.hyperlinking.XtextHyperlink;
import org.xtext.abs.Delta_decl;
import org.xtext.abs.Feature_decl;
import org.xtext.abs.Productline_decl;
import org.xtext.generator.AbsGenerator;

import com.google.inject.Inject;

public class MyHyperLinkHelper extends HyperlinkHelper {
	 @Inject AbsGenerator generator;
	//@Override
	//public void createHyperlinksByOffset(XtextResource resource, int offset,IHyperlinkAcceptor acceptor) {
    //	super.createHyperlinksByOffset(resource, offset, acceptor);
    //	System.out.println("Inside MyHyperLinkHelper");
    //}
    

	
	@Override
	public void createHyperlinksByOffset(XtextResource resource, int offset,IHyperlinkAcceptor acceptor) {


		EObjectAtOffsetHelper eObjectAtOffsetHelper = new EObjectAtOffsetHelper();
		EObject eObject = eObjectAtOffsetHelper.resolveElementAt(resource, offset);
		System.out.println(offset);
		System.out.println(resource);
		MessageConsole myConsole = findConsole("myConsole");
		MessageConsoleStream out = myConsole.newMessageStream();
		//TextConsole myConsole = findConsole("myConsole");
		//myConsole.getHyperlinks();
		if(eObject instanceof Delta_decl) {
			 out.println(generator.compile((Delta_decl)eObject));
		}
		
	    //out.print(myHyperlink);
		
		/*if (eObject instanceof Delta_decl) {
			System.out.println("Inside If");
			Delta_decl variableName = (Delta_decl) eObject;
			CompositeNode adapter = (CompositeNode) NodeModelUtils.getNode(variableName);

			Region region = new Region(adapter.getOffset(), adapter.getLength());
			
			final URIConverter uriConverter = resource.getResourceSet().getURIConverter();
			final String hyperlinkText = "Variable";
			
			final org.eclipse.emf.common.util.URI uri = EcoreUtil.getURI(eObject);
			final org.eclipse.emf.common.util.URI normalized = uri.isPlatformResource() ? (org.eclipse.emf.common.util.URI) uri : (org.eclipse.emf.common.util.URI) uriConverter.normalize(uri);

			XtextHyperlink result = new XtextHyperlink(); // Does not show link with getHyperlinkProvider().get()
			result.setHyperlinkRegion(region);
			result.setURI(normalized);
			result.setHyperlinkText(hyperlinkText);
			acceptor.accept(result);
		}*/
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
