package MY;

import java.util.Scanner;

public class StringHello {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String A = sc.next();
		System.out.println("Enter the second string");
		String B = sc.next();
		sc.close();
		System.out.println("Length of String " +""+ (A.length() + B.length()));
		String firstLetterOfA = A.substring(0, 1);
		String firstLetterOfB = B.substring(0, 1);
		System.out.println(firstLetterOfA);
		System.out.println(firstLetterOfB);
		

	}

}
