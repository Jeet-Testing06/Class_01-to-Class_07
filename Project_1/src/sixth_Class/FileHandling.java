//Read character by character

package sixth_Class;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\jitender.ahuja\\Desktop\\Jitender.txt");
		
		FileReader fr = new FileReader(f);
		
		int a;
		while((a=fr.read())!=-1)
		{
			
			System.out.println((char)a);
			
		}	
	}
}
