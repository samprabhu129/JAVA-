package practice;
public class hello {
	   public static void main(String[] args) {
	      int[] arr = {1, 2, 3, 2, 1,0};

	      System.out.println("Duplicate elements in the array: ");
	      for(int i = 0; i < arr.length; i++) {
	         for(int j = i + 1; j < arr.length; j++) {
	            if(arr[i]== arr[j]) {
	               System.out.println(arr[j]);
	            }
	         }
	      }
	   }
	}
