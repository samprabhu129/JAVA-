package MY;

import java.io.*;
public class FileReWrEg {

	public static void main(String[] args) {
		
		//Writer
		try {
			FileWriter fw = new FileWriter("D:\\DWrite.pptx");
			fw.write("Good morning .....God Bless you");
			fw.close();
		}
		catch(Exception e) {
			
		}
		// Reader
				try {
					FileReader fr = new FileReader("D://DWrite.txt");
					int i = 0;
					while((i=fr.read())!=-1) {
						System.out.println((char)i);
						
					}
					fr.close();
				}
				catch(Exception e) {
					
				}
		

	}

}
