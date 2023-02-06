class Owner{
	final int area  =1000;
	String dateOfPurchase="03-04-2003";
	String name ="sam";
	boolean noc =true;
	public void renew(){
		String color ="blue";
		String flat = "2bhk";
		int ceilheight =8;
		System.out.println("Old flat owner"+(color +" "+flat+" "+ceilheight));
	}
}
class New_Owner extends Owner{
	String dateOfRegister="03-02-2023";
	double flatvalue =2.400000;
	String name="Peter";
	public void display(){
		System.out.println("Area is :"+area);
		System.out.println("Owner name is :"+super.name);
		System.out.println("Current flat price is :"+flatvalue);
		System.out.println("New owner name is "+name);
	}
	public void renew(){
		String color ="offWhite";
		String flat = "3bhk";
		int ceilheight =10;
		System.out.println("New flat owner"+(color +" "+flat +" "+ceilheight));
		super.renew(); //call paternt method
	}
}
class SingleInheitence{
	public static void main(String args[]){
		New_Owner nc = new New_Owner();//child class object
		nc.display();//invoke child to access child to access cild and parent property
		nc.renew();//invoke child method
	}
}











