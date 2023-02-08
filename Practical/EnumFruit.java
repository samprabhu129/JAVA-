enum Fruits{
	MANGO,
	APPLE,
	WATERMELON,
	DRAGON;
}
class EnumFruit{
	public static void main(String args[]){
		Fruits fru=Fruits.DRAGON;
		switch(fru)
		{
			case MANGO:
			System.out.println("Hey! i am Mango");
			break;
			
			case APPLE:
			System.out.println("HEy! i am APPLE");
			break;
			
			case WATERMELON:
			System.out.println("HEY! I am WATERMELON");
			break;
			
			case DRAGON:
			System.out.println("HEY! I am DRAGON");
			break;
			
		}
	}
}