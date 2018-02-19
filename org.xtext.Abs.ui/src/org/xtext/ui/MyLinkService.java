package org.xtext.ui;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.xtext.ui.editor.hyperlinking.DefaultHyperlinkDetector;

public class MyLinkService extends DefaultHyperlinkDetector{
	
	@Override
	public IHyperlink[] detectHyperlinks(ITextViewer textViewer,
			IRegion region, boolean canShowMultipleHyperlinks) {
		System.out.println("Inside MyLinkService");
		//this.setHelper(new MyHyperLinkHelper());
		return super.detectHyperlinks(textViewer, region, canShowMultipleHyperlinks);
	}

}
