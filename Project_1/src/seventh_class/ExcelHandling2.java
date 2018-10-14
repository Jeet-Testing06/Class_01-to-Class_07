// Homework - Take input from user and write that in excel sheet

package seventh_class;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelHandling2 {
	
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		
		File f = new File("C:\\Users\\jitender.ahuja\\Desktop\\JeetHomeWork.xls");	
		
		WritableWorkbook wwb = Workbook.createWorkbook(f);
		WritableSheet wws = wwb.createSheet("JEet", 0);
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a string to enter in cell");
		String s1 = s.next();
		
		for (int i=0; i<1; i++)
		{
			for (int j=0; j<1; j++)
			{
				Label l = new Label(j, i, s1);
				wws.addCell(l);
			}
		}
		
		wwb.write();
		wwb.close();
		
		s.close();
		
	}

}
