class TypcastingExample{
    
	public static void main(String args[]){
		//widening
	int x = 892;
	long z = x; //automatically convert int to long
	System.out.println(x);
	System.out.println(z);
	double y = x;//automatically convert int to double
	System.out.println(y);
	
	//Narrowing
	double a = 560.442;
	int b = (int)a;
	System.out.println(b);
	System.out.println(a);
	}
}