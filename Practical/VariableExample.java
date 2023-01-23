class VariableExample{
	static int num = 55;//static
	
	long num1=5122222;//instance
	
	public void display(){
		char a ='M';//local
		double num2=20.2;
		System.out.println("local variable value:"+a);
		System.out.println("local variable value"+num2);
	}
	public static void calc(){
		double d = 2.4;
		double e = 1.1;
		double res = d+e;
		System.out.println("Result is:" +res);
	}
	public static void main(String args[]){
		VariableExample obj = new VariableExample();
		obj.display();//invoke nonstatic method with obj
		calc();//invoke static method
		System.out.println("Instanse variable value :"+obj.num1);//calling instance variable
		System.out.println("static variable value:"+num);

		}
}