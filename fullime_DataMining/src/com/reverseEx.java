package com;

public class reverseEx {
	public static void main(String[] args) {
		int aa[][]=new int[2][3];
		aa[0][0]=56;
		aa[0][1]=156;
		aa[0][2]=256;
		aa[1][0]=656;
		aa[1][1]=356;
		aa[1][2]=956;
		
		for(int i=aa.length-1;i>=0;i--)
		{
		for(int j=aa[i].length-1;j>=0;j--)	{
			System.out.println(aa[i][j]);
			
		}
		}
		
	}

}
