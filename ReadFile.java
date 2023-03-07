package com.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		File f = new File("/home/prakashthite1gm/Simplilearn_Java_Fsd_Phase1/JAVA_FSD_PHASE1/Simple.txt");
         
     	try {
			Scanner	filereader = new Scanner(f);
			
			while(filereader.hasNextLine()) {
				String fileData = filereader.nextLine();
				System.out.println(fileData);
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     	
	}

}
