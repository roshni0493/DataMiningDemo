package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;

public class FR {
	private static BufferedReader br;

	public static void main(String[] args) throws Exception {
		
	
	//FileInputStream fis=new FileInputStream("C:/Users/Dell/Desktop/file.txt");
	Reader fis=new FileReader("E://file");
	//ArrayList<String>al=new ArrayList<>();
	int count=0;
	String xx=null;
	br = new BufferedReader(fis);
	while((xx=br.readLine())!=null)
	{
		//String xx=br.readLine();
		if(xx.contains("java"))
		{	
			count++;//al.add(xx)
			System.out.println(count);
		}
	}

}
}