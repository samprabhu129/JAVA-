package MY;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exception_Eg {
	public void Eg() {
		/*try {
			Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the value of x :\n");
		    int x = sc.nextInt();
		    System.out.println("Enter the value of y :\n");
		    int y = sc.nextInt();
		    int result = x / y;
		    System.out.println("Result is "+result);*/
		Scanner sc = new Scanner(System.in);
		try {
			try {
				System.out.println("enter the value of x");
				int x = new Integer(sc.nextInt());
				System.out.println("enter the value of y");
				int y = new Integer(sc.nextInt());
				System.out.println(""+(x/y));
			}
			catch(InputMismatchException e) {
				System.out.println("Java.util.InputMismatchException");
			}
		}
		catch(InputMismatchException e){
			System.out.println(e);
			sc.close();			
		}
	}
	public static void	 main(String args[]) {
		Exception_Eg ee = new Exception_Eg();
		ee.Eg();
	}

}
