package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReading {

	public static void main(String[] args) throws IOException
	{
		 // to establish a connection between the class file and the actual file
		//this can be done by creating an object  FileInputStream
		FileInputStream fis= new FileInputStream("C:\\Users\\vikas\\Desktop\\TestData.xlsx");
		
		//open workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheetAt(1);
		
		//System.out.println(sh.getRow(0).getCell(1));
		
		// to get the last Row number
		int lrn = sh.getLastRowNum();
		
		//using cell Iterator
		for(int i=0;i<=lrn;i++)
		{
			Row r=sh.getRow(i);
			Iterator<Cell> ci =r.cellIterator();
			while(ci.hasNext())
			{
				System.out.println(ci.next());
			}
		}
	}

}
