//Homework to take 5 lines from user and enter in file


package sixth_Class;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling4 {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\jitender.ahuja\\Desktop\\Jitender.txt");
		
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 5 lines to write in a file");
		
		String s1;
		
		
		for (int i=0; i<5; i++)
		{
			
			s1 = s.nextLine();

			bw.write(s1);
			bw.newLine();

		}
		
		bw.close();	
	}
}
