//Read data from Excel .xls

package seventh_class;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelHandling {
	
	public static void main(String[] args) throws BiffException, IOException {
		
		File f = new File("C:\\Users\\jitender.ahuja\\Desktop\\Jeet.xls");
		
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet(0);
		
		int r = ws.getRows();
		int c = ws.getColumns();
		
		System.out.println("Maximum rows occupied in Excel Sheet: "+r);
		System.out.println("Maximum coloumns occupied in Excel Sheet: "+c);
		
		System.out.println();
		
		for (int i=0; i<r; i++)
		{
			for (int j=0; j<c;j++)
			{
				Cell c1 = ws.getCell(j,i);
				System.out.println(c1.getContents());
			}			
		}
	}
}