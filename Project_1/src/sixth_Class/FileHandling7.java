//Count the characters in a file

package sixth_Class;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling7 {
	
	public static void main(String[] args) throws IOException {
		
	
		File f = new File("C:\\Users\\jitender.ahuja\\Desktop\\Jitender.txt");
		
		FileReader fr = new FileReader(f);	
		
		int a;
		int count=0;
		while ((a=fr.read())!=-1)
		{
			
			count++;
			System.out.println((char)a);
			
		}
		System.out.println("Total number of characters in a file are: "+count);
	
	}
}