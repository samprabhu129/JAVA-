package MY;

public class StringEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1 = "Sam";
		String a2 = "Sam Anudip";
		String a3 = new String("anudip");
		String a4 = "Sam";
		//equal()  compares values of String for equality
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		System.out.println(a1.equalsIgnoreCase(a4));
		
		System.out.println(a1==a3);
		System.out.println(a1==a2);
		
		//lexicographically
		String a5 = "apple";
		String a6 = "america";
		System.out.println(a6.compareTo(a5));//negative
		System.out.println(a1.compareTo(a4));//equal
		System.out.println(a2.compareTo(a1));//positive

	}

}
