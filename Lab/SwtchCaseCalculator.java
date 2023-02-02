import java.util.Scanner;
class SwtchCaseCalculator{
	public static void main(String Args[]){
		int a,b;
		int c=0;
		char operator;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		a = sc.nextInt();
		System.out.println("Enter second number");
		b = sc.nextInt();
		System.out.println("Enter operator '+' '-' '*' '/' ");
		operator = sc.next().charAt(0);
		
		switch(operator){
		case '+':
		c = a + b;
		break;
		
		case '-':
	    c = a-b;
		break;
		
		case '*':
		c = a*b;
		break;
		
		case '/':
		c = a/b;
		break;
		
		default:
		System.out.println("INVALID");
		}
	System.out.println("Result : " +c);
	}
}