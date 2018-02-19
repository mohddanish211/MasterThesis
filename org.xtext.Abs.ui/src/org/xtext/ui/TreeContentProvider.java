package org.xtext.ui;

import javax.annotation.PostConstruct;

import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;


public class TreeContentProvider implements ITreeContentProvider {
	
	
	
    @Override
    public boolean hasChildren(Object element) {
        return false;
    }

    @Override
    public Object getParent(Object element) {
        return null;
    }

    @Override
    public Object[] getElements(Object inputElement) {
        return ArrayContentProvider.getInstance().getElements(inputElement);
    }

    @Override
    public Object[] getChildren(Object parentElement) {
        return null;
    }
    
    @PostConstruct
    public void postConstruct(Composite parent) {
        TreeViewer viewer = new TreeViewer(parent);
        viewer.setContentProvider(new TreeContentProvider());
        viewer.getTree().setHeaderVisible(true);
        viewer.getTree().setLinesVisible(true);

        TreeViewerColumn viewerColumn = new TreeViewerColumn(viewer, SWT.NONE);
        viewerColumn.getColumn().setWidth(300);
        viewerColumn.getColumn().setText("Names");
        viewerColumn.setLabelProvider(new ColumnLabelProvider());

        viewer.setInput(new String[] { "Simon Scholz", "Lars Vogel", "Dirk Fauth", "Wim Jongman", "Tom Schindl" });

        GridLayoutFactory.fillDefaults().generateLayout(parent);
    }
}