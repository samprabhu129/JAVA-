enum Directions{
	EAST,
	WEST,
	NORTH,
	SOUTH;
}
public class EnumExample1{
	Directions direction;
	public EnumExample1(Directions direction)
	{
		this.direction=direction;
	}
	void checkDirection()
	{
		switch(direction)
		{
			case EAST:
			System.out.println("EAST is the direction");
			break;
			
			case WEST:
			System.out.println("West is the direction");
			break;
			
			case NORTH:
			System.out.println("North is the direction");
			break;
			
			case SOUTH:
			System.out.println("South is the direction");
			break;
			
			default:
			System.out.println("check with the direction");
			break;
		}
	}
	public static void main(String args[]){
		String str ="NORTH";
		EnumExample1 e=new EnumExample1(Directions.valueOf(str));
		e.checkDirection();
	}
	}