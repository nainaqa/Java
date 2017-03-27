package Practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src=new File("C:\\Users\\laxmiprasanna\\Sample.xlsx");
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//If we use .xls file we use HSSFWorkbook
		
		XSSFSheet Sht1=wb.getSheetAt(0);
		int RowV=Sht1.getLastRowNum();
		System.out.println("Total number of rows is "+RowV+1);
		
		for(int i=0;i<RowV;i++){
			String data=Sht1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data in the row is "+data);
		}
		
		wb.close();
	}

}
