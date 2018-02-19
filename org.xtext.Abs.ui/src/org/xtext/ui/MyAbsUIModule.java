package org.xtext.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.hyperlinking.DefaultHyperlinkDetector;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkHelper;

public class MyAbsUIModule extends AbstractAbsUiModule{

	public MyAbsUIModule(AbstractUIPlugin plugin) {
		super(plugin);
		// TODO Auto-generated constructor stub
	}
	
	public Class<? extends DefaultHyperlinkDetector> bindDefaultHyperlinkDetector() {
		return MyLinkService.class;
	}
	
	public Class<? extends IHyperlinkHelper> bindIHyperlinkHelper() {
		return MyHyperLinkHelper.class;
	}

}
