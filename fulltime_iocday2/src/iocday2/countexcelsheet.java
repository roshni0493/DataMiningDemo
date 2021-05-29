package iocday2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class countexcelsheet {
	public static void main(String[] args) throws BiffException, IOException {
		HashMap<String, Integer>hm=new HashMap<>();
		hm.put("kiran", 30);
		hm.put("kiran", 40);
		hm.put("kiran1", 60);
		hm.put("kiran1", 70);
		hm.put("kiran2", 60);
		hm.put("kiran2", 70);
		hm.put("kiran1", 60);
		hm.put("kiran1", 70);
		System.out.println(hm);
		
		File file=new File("C://Users/Dell/Desktop/countexcel.xls");
		Workbook workbook=Workbook.getWorkbook(file);
		Sheet sheet=workbook.getSheet(0);
		int rows=sheet.getRows();
		HashMap<String, Integer>hmdetail=new HashMap<>();
		for(int i=0;i<rows;i++) 
		{
			Cell[] cells=sheet.getRow(i);
			
			ArrayList<String>al=new ArrayList<>();
			
			for(Cell cell:cells)
			{
			al.add(cell.getContents())	;
				
			}
		System.out.println(al);
		Object o=hmdetail.put(al.get(0),Integer.parseInt(al.get(1)));
		System.out.println(o);
			if(o!=null) 
			{
			hmdetail.put(al.get(0),Integer.parseInt(al.get(1))+(Integer)o);
			}
			}
		
	
		}

}
