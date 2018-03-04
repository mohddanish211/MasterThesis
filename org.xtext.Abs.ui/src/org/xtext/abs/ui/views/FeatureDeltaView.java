package org.xtext.abs.ui.views;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;

import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.ui.*;
import org.eclipse.swt.SWT;

import java.util.Map;

import javax.inject.Inject;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class FeatureDeltaView extends ViewPart {
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.xtext.abs.ui.views.FeatureDeltaView";

	@Inject IWorkbench workbench;
	//	@Inject EObjectAtOffsetHelper eObjectOffSetHelper;

	private TableViewer viewer;
	private Action doubleClickAction;

		class ViewLabelProvider extends LabelProvider implements ITableLabelProvider {
		@Override
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}
		@Override
		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}
		@Override
		public Image getImage(Object obj) {
			return workbench.getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
		@Override
		public String getText(Object element) {
			Map<INode,XtextResource> nodeElementMap=  (Map<INode, XtextResource>) element;
			INode nodeElement = null;
			XtextResource xtextResource=null;
			for ( INode key : nodeElementMap.keySet() ) {
				nodeElement= key;
			}
			xtextResource = nodeElementMap.get(nodeElement);
			System.out.println(xtextResource.toString());
			return element == null ? "" : nodeElement.getText()+"  [:"+xtextResource.getURI()+"]";//+"["+nodeElement.getOffset()+"]";//$NON-NLS-1$
		}
	}

	@Override
	public void createPartControl(Composite parent) {
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);

		viewer.setContentProvider(ArrayContentProvider.getInstance());
		//viewer.setInput(new String[] { "Cost", "Two", "Three" });
		viewer.setLabelProvider(new ViewLabelProvider());

		// Create the help context id for the viewer's control
		workbench.getHelpSystem().setHelp(viewer.getControl(), "org.xtext.Abs.ui.viewer");
		getSite().setSelectionProvider(viewer);
		makeActions();
		//hookContextMenu();
		hookDoubleClickAction();
		//contributeToActionBars();
	}

	/*private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				FeatureDeltaView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(action1);
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(action1);
		manager.add(action2);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action1);
		manager.add(action2);
	}*/

	private void makeActions() {
		doubleClickAction = new Action() {
			public void run() {
				IStructuredSelection selection = viewer.getStructuredSelection();
				//`ArrayList<Object> objList = (ArrayList<Object>) selection.getFirstElement();
				Map<INode,XtextResource> nodeResourceMap = (Map<INode,XtextResource>)selection.getFirstElement();
				INode nodeElement = null;
				for ( INode key : nodeResourceMap.keySet() ) {
					nodeElement= key;
				}
				//showMessage("Double-click detected on "+node.getText());
				System.out.println("$$$$$$$$$$$$$$$$$$$");
				System.out.println(nodeElement);
				/*IHyperlinkAcceptor  acceptor= (IHyperlinkAcceptor)objList.get(2);
				XtextHyperlink result = hyperlinkProvider.get();
				ITextRegion textRegion = node.getTextRegion();
				Region region = new Region(textRegion.getOffset(), textRegion.getLength());
				result.setHyperlinkRegion(region);
				result.setURI(resource.getURI());
				result.setHyperlinkText(node.getText());
				acceptor.accept(result);*/

				System.out.println("Clicked selection");
				System.out.println(selection);
				ITextEditor editor = (ITextEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
				//IEditorPart  editor=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
				//editor.getSite().getPage();
			//	IDocumentProvider provider= editor.getDocumentProvider();
				//IDocument document= provider.getDocument(editor.getEditorInput());
				//int line=nodeElement.getStartLine();
				int start= nodeElement.getOffset();
				int length = nodeElement.getLength();
				editor.selectAndReveal(start, length);
				//IWorkbenchPage page= editor.getSite().getPage();
				//page.activate(editor);
			}
		};
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}

	public void updateContent(Map<INode,XtextResource> node) {
		viewer.add(node);
	}

	public void removeOldContent() {
		viewer.refresh();
	}

	/*private void showMessage(String message) {
		MessageDialog.openInformation(
				viewer.getControl().getShell(),
				"FeatureDelta View",
				message);
	}*/

	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}

}
