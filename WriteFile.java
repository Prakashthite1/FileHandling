package com.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter  fwrite = new FileWriter("/home/prakashthite1gm/Simplilearn_Java_Fsd_Phase1/JAVA_FSD_PHASE1/Simple.txt");
		     fwrite.write("Practice,Practice and Practice is only way to crack the interview!!!");
		     fwrite.close();
		     System.out.println("The contains Sucessfully wrriten inside the file");
		} catch (IOException e) {
			System.out.println("unexception error occured...");
			//e.printStackTrace();
		}

	}

}
