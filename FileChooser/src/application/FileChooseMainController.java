/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Using JAVA-FX choosing the offline files,path's through--
 *   -- eclipse with single or multiple files similarly..
 *   Project:  FileChooseMainController.
 *   Platform: JavaSE-22.0.1
 *   Compiler: Java 17
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/



package application;    

import java.io.File;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

//Declaring the attributes.
public class FileChooseMainController {
	@FXML
	private Button button1;

	@FXML
	private Button button2;

	@FXML
	private ListView listview;

	/**
	 * Below block creates the button1[Select-One] attributes and perform--
	 * the operation by clicking on it.
	 */
	public void Button1Action(ActionEvent event) {
		FileChooser fc = new FileChooser();
		/**
		 * this below line will get us to directly path location or file locations where
		 * i mentioned path location in the file path.
		 */
		fc.setInitialDirectory(new File("C:\\Users\\DELL\\Downloads\\poi-bin-5.2.3-20220909\\poi-bin-5.2.3\\lib"));
		
		//we can also choose PDF format files using below line.
		//fc.getExtensionFilters().addAll(new ExtensionFilter("PDF Files","*.pdf"));
		
		File selectedFile = fc.showOpenDialog(null);
 
		if (selectedFile != null) {
			/*
			 * if selected file is not null then we can get the names,path's,locations etc 
			 * by using below line.
			 */
			// listview.getItems().add(selectedFile.getName());
 
			// instead name we can take path also
			/*
			 * below line prints exact path of the location when- -we choose any files
			 * randomly.
			 */
			listview.getItems().add(selectedFile.getAbsolutePath());
		} else {
			System.out.println("File is not valid...!");
		}

	}
	/**
	 * Below block creates the button2[Select-Multiple] attributes and perform--
	 * the operation by clicking on it.
	 */

	public void Button2Action(ActionEvent event) {
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File("C:\\Users\\DELL\\Downloads\\poi-bin-5.2.3-20220909\\poi-bin-5.2.3\\lib"));
		//fc.getExtensionFilters().addAll(new ExtensionFilter("PDF Files","*.pdf"));
		List<File> selectedFile = fc.showOpenMultipleDialog(null);
		
		if (selectedFile != null) {
			
			for(int i=0;i<selectedFile.size();i++) {
				
				// listview.getItems().add(selectedFile.getName());
				// instead name we can take path also
				/*
				 * below line prints exact path of the location when- 
				 * -we choose any files randomly
				 */
				listview.getItems().add(selectedFile.get(i).getAbsolutePath());
			}
			

			
			
			
		}

	}

}
