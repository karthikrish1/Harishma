package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class f2 {

	public static void main(String[] args) throws IOException {
		
		         //File                   : reach the path        :   pass path of the file as input
				//FileReader             : fetch  a file        :   pass file ibject as input
				//Bufferedreader          : read content         :   pass filereadr object as input
				
				// nonstatic in nature 
				
				File f= new File("C:\\Users\\hp\\eclipse-workspace\\harishma\\src\\filehandling\\m.txt");
				FileReader fw= new FileReader(f);
				BufferedReader bw= new BufferedReader(fw);
				String line;
			while((line=bw.readLine())!=null)
			{
				System.out.println(line);
			}
			
			/*
			 * 
			 * first iteration
			 *       bw.readline reads first line and store it in line      line=hi      line!=null   hi!=null => print hi
			 *       
			 * second iteration
			 *     bw.readlie reads second line and store in line           line=hello   line!==null  hello!=null => print hello
			 *     
			 *third iteration
			 *    bw.readline reads nothing              line=null                                  line!=null  null!=null 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * */
	}
}
