package com;

import java.io.File;

public class Renamefile {
	public static void main(String[] args) {
		
		File folder=new File("E:/file");
		File files[]=folder.listFiles();
		
		int filecount=0;
		
		for(int i=0;i<files.length;i++) {
			if(files[i].isFile())
			{
				
				System.out.println("Old Name"+files[i].getName());
				
				String newfilename=files[i].getName().replace("a", "z");
				System.out.println("New Name"+newfilename);
				
				File f=new File("E:/file//"+newfilename);
				files[i].renameTo(f);//boolean
				filecount++;
			}
		}
		System.out.println("FileCount:"+filecount);
	}

}
