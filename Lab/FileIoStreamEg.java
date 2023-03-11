package MY;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIoStreamEg {

	public static void main(String[] args) {
		// Writing
		try {
			FileOutputStream f = new FileOutputStream("D:\\file1.txt");
			String name = "I am sam from anudip foundation";
			byte arr[] = name.getBytes();//converting string to byte
			
			f.write(arr);
			f.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		//reading
		try {
			FileInputStream f1 = new FileInputStream("D:\\file1.txt");
			int i=0;
			while((i=f1.read())!=-1) {
				System.out.println((char)i);
			}
			f1.close();
		}
		catch(Exception e){
			
		}

	}

}
