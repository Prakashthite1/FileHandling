package com.FileHandling;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		File f = new File("/home/prakashthite1gm/Simplilearn_Java_Fsd_Phase1/JAVA_FSD_PHASE1/Simple.txt");
		if(f.exists()) {
			System.out.println(f.getName());
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println(f.getAbsoluteFile());
			System.out.println(f.length());
		}
		else {
			System.out.println("File Does not Existing.....");
		}
	}

}
