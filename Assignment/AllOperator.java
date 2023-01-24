class AllOperator{
	public void arithmeticOperator(){
		int x = 1 ,y = 2;
		System.out.println("*******Arithmetic Operator*********");
		System.out.println("Addition = "+(x+y));
		System.out.println("Substraction = "+(x-y));
		System.out.println("Multiplication = "+(x*y));
		System.out.println("Division = "+(x/y));
		System.out.println("Modulus = "+(x%y));
	}
	public void logicalOperator(){
		int a = 5 , b = 6;
		System.out.println("******Logical Oerator******");
		System.out.println((a<b)&&(++a<b));
		System.out.println((a>b) || (b>a));
	}
	public void AssignmentOperator(){
		int a=1;
		System.out.println("********Assignment Operator*********");
		System.out.println(a+=5);
		System.out.println(a-=5);
		System.out.println(a*=5);
		System.out.println(a/=5);
		System.out.println(a%=5);
	}
	public void TernaryOperator(){
		int a = 0;
		int b =(a>0)? 5 : 10;
		System.out.println("***********Ternary Operator*************");
		System.out.println(b);
	}
	
	public static void main(String Args[]){
		AllOperator op = new AllOperator();
		op.arithmeticOperator();
		op.logicalOperator();
		op.AssignmentOperator();
		op.TernaryOperator();
	}
}
