package practice;

import java.util.Arrays;

public class AscDesArray {
	public void Asc() {
		int[] arr = {5, 2, 8, 1, 9};

		// sorting the array in ascending order
		Arrays.sort(arr);

		// printing the sorted array in ascending order
		for (int i = 0; i < arr.length; i++) {
		  System.out.print(arr[i] + " ");
		}
		
	}
	public void Des() {
		int[] arr = {5, 2, 8, 1, 9};

		// sorting the array in descending order
		Arrays.sort(arr);
		for (int j = arr.length - 1; j >= 0; j--) {
		  System.out.print(arr[j] + " ");
		}

		
	}


public static void main(String args[]) {
	AscDesArray ada = new AscDesArray();
	System.out.println("Ascending");
	ada.Asc();
	System.out.println("");
	System.out.println("Desending");
	ada.Des();
	
}
}
