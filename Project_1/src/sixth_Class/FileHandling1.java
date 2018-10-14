// Read Line by Line


package sixth_Class;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling1 {
	
	public static void main(String[] args) throws IOException {
		
		
		File f = new File("C:\\Users\\jitender.ahuja\\Desktop\\Jitender.txt");
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String a;
		while((a=br.readLine())!=null)
		{
			
			System.out.println(a);
			
		}		
	}
}