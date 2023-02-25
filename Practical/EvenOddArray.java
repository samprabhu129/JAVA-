package practice;

public class EvenOddArray {
	public void Even() {
		int []even = {1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < even.length; i++) {
			  if (i % 2 == 0) {
			    System.out.println(even[i]);
			  }
			}
	}
	public void Odd() {
		
		int [] odd= {1,2,3,4,5,6,7,8,9};
		for (int j =0; j<odd.length; j++) {
			if (j%2!=0) {
				System.out.println(odd[j]);
			}
		}
	}
	public static void main(String[]args) {
		EvenOddArray eoa = new EvenOddArray();
		System.out.println("****Even Number****");
		eoa.Odd();
		System.out.println("****Odd Number****");
		
		eoa.Even();
	}

}
