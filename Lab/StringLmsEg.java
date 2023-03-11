package MY;

public class StringLmsEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Welcome to Java World");
		
		System.out.println("Original String"+s1);
		//shows the output for 5th position
		System.out.println("5th psition of String: "+s1.charAt(4)+" ");
		//compare and ignore the case and shows
		System.out.println("Comparing string s1 with 'welcome':"+s1.compareToIgnoreCase("Welcome"));
		//this concat will join s1 and s2
		String s2 = s1.concat("- Let us learn");
        System.out.println("New string: " + s2);
        //it shows the position of string s1
        int position = s1.indexOf('a');
        System.out.println("Position of first 'a': " + position);
        //It will replace all the a to e 
        String s3 = s1.replace("a", "e");
        System.out.println("String after replacing 'a' with 'e': " + s3);
        //it shows from 4 to 10 index of letter
        String s4 = s1.substring(4, 10);
        System.out.println("Substring between 4th and 10th position: " +s4);
		//convert into lower case
        String s5 = s1.toLowerCase();
        System.out.println("Lowercase string: " + s5);
		

	}

}
