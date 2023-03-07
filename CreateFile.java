package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		File f = new File("/home/prakashthite1gm/Simplilearn_Java_Fsd_Phase1/JAVA_FSD_PHASE1/Simple.txt");
       
		try {
			if(f.createNewFile()) {
				
				System.out.println(" File " + f.getName() + " is created Succesfully");
			}
		} catch (IOException e) {
			
			System.out.println("Execption occured during file creation....");
			
		}
		
	}

}
