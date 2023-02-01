class My1{
     
	 My1(){
		 System.out.println("hello");
	 }
	 //creating an default constructor
	 int a;
	 String name;
	 
	 public void display(){
		 System.out.println(a+ " " +name);
	 }
	 public static void main(String args[]){
	       System.out.println("aaa");
		   
		   My1 b = new My1();
		   b.display();
	 }
}