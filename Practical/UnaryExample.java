class UnaryExample{
     public void increment()
	 {
	 int x = 10;
	 System.out.println(x++);
	 System.out.println(x++);
	 System.out.println(++x);
	 System.out.println(x++);
	 System.out.println(x);
	 }
	 public void decrement()
	 {
	 int x = 10;
	 System.out.println(x--);
	 System.out.println(x--);
	 System.out.println(--x);
	 System.out.println(x--);
	 System.out.println(x);
	 }
     public static void main(String args[]){
	 UnaryExample obj = new UnaryExample();
	 obj.increment();
	 obj.decrement();
	 }
	 
	 
}