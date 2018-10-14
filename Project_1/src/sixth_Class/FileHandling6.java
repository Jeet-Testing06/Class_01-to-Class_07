//Count the words in a file


package sixth_Class;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling6 {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\jitender.ahuja\\Desktop\\Jitender1.txt");
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		

		String s;
		int count =0;
		while ((s=br.readLine())!=null)
		{
			String[] s1 = s.split(" ");
			
			for (int i=0; i<s1.length; i++)
			{
				
				count++;
				System.out.println(s1[i]);
				
			}
			count = count+0;
			
			
		}
		System.out.println();
		System.out.println("Total words in a file are: "+count);
		
	}
}
