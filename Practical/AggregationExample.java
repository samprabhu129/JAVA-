  class Idproof{
  int inum;
  String city;
  String state;
  int pincode;
  int dob;
  
      Idproof(int inum,String city,String state,int pincode,int dob){
	   this.inum = inum;
	   this.city = city;
	   this.state = state;
	   this.pincode = pincode;
	   this.dob = dob;
	  }
  } 
  class Student{
    int id;
	String name;
	String emailid;
	long contact;
	Idproof idp;
	
	Student(int id, String name, String emailid,long contact,Idproof idp){
	    this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.contact = contact;
		this.idp =idp;
  }
  public void show(){
      System.out.println(id+" "+name+" "+emailid+" "+contact);
	  System.out.println(idp.inum+" "+idp.city+" "+idp.state+" "+idp.pincode+" "+idp.dob);
  }
  }
  class AggregationExample{
       public static void main(String args[]){
	   Idproof i = new Idproof(154444,"mumbai","maha",400037,03042003);
	   
	   Student s = new Student(101,"sam","sam@gmail.com",99862625,i);
	   
	   s.show();
	   }
  }