class ComparisonExample{
     public void cal(){
	 int a = 10 , b = 12;
	 System.out.println("a>b" +(a>b));
	 System.out.println("a<b" +(a<b));
	 System.out.println("a>=b" +(a>=b));
	 System.out.println("a<=b" +(a<=b));
	 System.out.println("a!=b" +(a!=b));
	 System.out.println((a<b)&&(a++<b));//logical
	 System.out.println((a<b)&(a++>b));//bitwise
	 System.out.println((a>b)||(a<b));//
	 }
     public static void main(String Args[]){
		 ComparisonExample obj = new ComparisonExample();
		 obj.cal();
	 }
}