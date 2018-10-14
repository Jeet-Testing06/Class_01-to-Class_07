// Write data in excel

package seventh_class;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelHandling1 {
	
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		
		File f = new File("C:\\Users\\jitender.ahuja\\Desktop\\Jeet1.xls");
		
		WritableWorkbook wwb = Workbook.createWorkbook(f);
		WritableSheet wws = wwb.createSheet("Jeet", 0);
		
		for (int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				Label l = new Label(j, i, "Write");
				wws.addCell(l);	
			}
		}
		
		wwb.write();
		wwb.close();	
	}
}