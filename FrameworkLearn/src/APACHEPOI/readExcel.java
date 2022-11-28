package APACHEPOI;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {

	public String read(String Value) throws Exception, IOException 
	{
		File f = new File("C:\\Users\\vikas\\Desktop\\DemoData.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(f);
		
		XSSFSheet sh = wb.getSheetAt(0);
		
		int LastRowNum = sh.getLastRowNum();
		System.out.println(LastRowNum);
		String Key="";
		for(int j=1; j<=LastRowNum;j++)
		{
			Row r = sh.getRow(j);
			System.out.println(r.getCell(0));
			if(r.getCell(0).toString().equals(Value))
			{
				Key= r.getCell(1).toString();
				break;
			}
		}
		return Key;
	}

}
