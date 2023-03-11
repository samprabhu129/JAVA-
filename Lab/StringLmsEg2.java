package MY;

public class StringLmsEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        StringBuffer sb = new StringBuffer("This is StringBuffer");
		        System.out.println("Original String: " + sb);

		        // Adds to existing string and display it.
		        sb.append("- This is a sample program");
		        System.out.println("String after appending: " + sb);

		        // Inserts into the existing string at 21st position and display it.
		        sb.insert(21, "Object");
		        System.out.println("String after insertion: " + sb);

		        // Reverses the entire string and displays it.
		        sb.reverse();
		        System.out.println("Reversed string: " + sb);

		    }
		

	}

