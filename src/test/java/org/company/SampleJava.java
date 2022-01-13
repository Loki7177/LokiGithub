package org.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleJava {

	public static void main(String[] args) throws IOException {
		
	
	File f = new File("C:\\Users\\Kuzhal\\eclipse-workspace\\FrameWorking\\Excel\\School.xlsx");
	
	FileInputStream fins = new FileInputStream(f);
	
	Workbook w=new XSSFWorkbook(fins); 
	
	Sheet sh = w.getSheet("Sheet1");
	
	int physicalNumberOfRows = sh.getPhysicalNumberOfRows();
	System.out.println(physicalNumberOfRows);
		
	
	Row r = sh.getRow(1);
	Cell c = r.getCell(1);
	System.out.println(c);
	
	Sheet sl = w.getSheet("Sheet1");
	Row r1 = sl.getRow(1);
	Cell c1 = r1.getCell(2);
	System.out.println(c1);
	
	Sheet sl1 = w.getSheet("Sheet1");
	Row mob = sl1.getRow(1);
	Cell no = mob.getCell(3);
	System.out.println(no);
	
	
	int norows = sh.getPhysicalNumberOfRows();
			for (int i = 0; i < norows; i++) {
				
				Row rows = sh.getRow(i);
				
	int nocells = rows.getPhysicalNumberOfCells();			
				
		for (int j = 0; j < nocells; j++) {
			
			Cell cells = rows.getCell(j);
			
			System.out.println(cells);
			
			
			
		}		
			}
	}		 

}
