//Homework to read from file 1 and write to file 2


package sixth_Class;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling5 {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\jitender.ahuja\\Desktop\\Jitender.txt"); //Read from this
		File f1 = new File("C:\\Users\\jitender.ahuja\\Desktop\\Jitender1.txt"); //Write into this
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter(f1);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String s;
		while ((s=br.readLine())!=null)
		{
			
			bw.write(s);
			bw.newLine();
		}
		
		bw.close();
	}
}
