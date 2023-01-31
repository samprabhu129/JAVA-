import java.util.Scanner;

class SwitchExample1{
	public static void main(String Arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your favourite Number");
		int numbers = sc.nextInt();
		
		switch(numbers){
		case 1:
		System.out.println("one");
		break;
		
		case 2:
		System.out.println("Two");
		break;
		
		case 3:
		System.out.println("Three");
		break;
		
		case 4:
		System.out.println("Four");
		
		case 5:
		System.out.println("Five");
		break;
		
		case 6:
		System.out.println("Six");
		break;
		
		case 7:
		System.out.println("Seven");
		break;
		
		case 8:
		System.out.println("Eight");
		break;
		
		case 9:
		System.out.println("Nine");
		break;
		
		case 10:
		System.out.println("Ten");
		break;
		
		default:
		System.out.println("Try from 1-10  .");
		break;
		 }
	}
	}