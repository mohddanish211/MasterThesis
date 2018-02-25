package org.xtext.ui;

import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;

public class TreeContentProvider extends BaseLabelProvider implements ILabelProvider{

	@Override
	public Image getImage(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText(Object element) {
		// TODO Auto-generated method stub
		System.out.println("Element is");
		System.err.println(element);
		System.out.println(element);
		return null;
	}
	


}