import java.util.Scanner;
class Loops{
	public void calc(int marks){
		if((marks>=85)&&(marks<=100))
		{
			System.out.println("Your Grade is 'O'");
		}
		else if((marks>=75)&&(marks<=84))
		{
			System.out.println("Your Grade is 'A++'");
		}
		else if((marks>=56)&&(marks<=74))
		{
			System.out.println("Your Grade is 'A'");
		}
		else if((marks>=45)&&(marks<=55))
		{
			System.out.println("Your Grade is 'B'");
		}
		else if((marks>=35)&&(marks<=44))
		{
			System.out.println("Your Grade is 'C'");
		}
		else if((marks>=0)&&(marks<=34))
		{
			System.out.println("Your Grade is Failed!!! ");
		}
		else
		{
			System.out.println("Enter different input");
		}	
	}
	public static void main(String sam[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Score: ");
		int marks = sc.nextInt();
		
		Loops obj = new Loops();
		obj.calc(marks);
	}
}