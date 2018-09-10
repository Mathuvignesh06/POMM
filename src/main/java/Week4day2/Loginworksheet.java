package Week4day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Loginworksheet {

	public String[][] exceldata(String fileName) throws IOException {
	//open workbook
		XSSFWorkbook wbook=new XSSFWorkbook("./dataa./"+fileName+".xlsx");
		//go to sheet
		XSSFSheet sheet = wbook.getSheetAt(0);
		//go to row
         int rowcount = sheet.getLastRowNum();
         System.out.println(rowcount);
         int cellcount = sheet.getRow(0).getLastCellNum(); 
         System.out.println(cellcount);
         String[][] data=new String[rowcount][cellcount];
         for (int i = 1; i <= rowcount; i++) {
        	 XSSFRow row = sheet.getRow(i);
        	 for (int j = 0; j < cellcount; j++) {
        		 XSSFCell cell = row.getCell(j);
        		 data[i-1][j]=cell.getStringCellValue();
        		 System.out.println(data);
				
			}
			
		}
         wbook.close();
		return data;
	}

}
