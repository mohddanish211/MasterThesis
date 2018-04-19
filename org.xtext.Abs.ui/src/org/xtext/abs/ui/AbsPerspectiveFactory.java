package org.xtext.abs.ui;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.console.IConsoleConstants;
import org.xtext.abs.plugin.console.ConsoleManager;

public class AbsPerspectiveFactory implements IPerspectiveFactory  {

	public void createInitialLayout(IPageLayout layout) {
		  System.out.println("@@@@@@@@@@@@@@@@I am from perspective!!!!!");
		  String editorArea = layout.getEditorArea();
		  try {
			ConsoleManager.displayConsoleView();
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error while creating console.....");
		}
	        IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, 0.20f, editorArea);
	        IFolderLayout leftTop = layout.createFolder("leftTop", IPageLayout.BOTTOM, 0.5f, "left");
	        IFolderLayout bottomRight = layout.createFolder("bottomRight", IPageLayout.BOTTOM, 0.75f, editorArea);
	        IFolderLayout topRight = layout.createFolder("topRight", IPageLayout.RIGHT, 0.80f, editorArea);

	        left.addView(IPageLayout.ID_PROJECT_EXPLORER);
	        left.addPlaceholder(IPageLayout.ID_BOOKMARKS);
	        
	        //Adding ABS module explorer
	      //Check  leftTop.addView(NAVIGATOR_ID);
	        
	        bottomRight.addView(IConsoleConstants.ID_CONSOLE_VIEW);
	        bottomRight.addView(IPageLayout.ID_TASK_LIST);
	        bottomRight.addView(IPageLayout.ID_PROBLEM_VIEW);
	        
	        topRight.addView(IPageLayout.ID_OUTLINE);
	        
	     //   layout.addNewWizardShortcut("org.abs-models.abs.plugin.abswizard");
	      //  layout.addNewWizardShortcut("org.abs-models.abs.plugin.absfilewizard");
	        
	        //add perspective and view shortcuts
	  //      layout.addPerspectiveShortcut(ABSDEBUGPERSPECTIVE_ID);
	    //    layout.addShowViewShortcut(NAVIGATOR_ID);
	        //add non-abs specific view shortcuts
	        layout.addShowViewShortcut(IPageLayout.ID_TASK_LIST);
	        layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
	        layout.addShowViewShortcut(IConsoleConstants.ID_CONSOLE_VIEW);
	        layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
	        layout.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);
	}


}

