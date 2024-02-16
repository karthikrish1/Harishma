package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class f1 {
	public static void main(String[] args) throws IOException {
		//File                   : reach the path        :   pass path of the file as input
		//FileWriter             : create  a file        :   pass file ibject as input
		//BufferedWriter         : write content         :   pass filewriter object as input
		
		// nonstatic in nature 
		
		File f= new File("C:\\Users\\hp\\eclipse-workspace\\harishma\\src\\filehandling\\m.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("hi");
		bw.newLine();
		bw.write("hello");
		bw.newLine();
		bw.close();
	}

}
