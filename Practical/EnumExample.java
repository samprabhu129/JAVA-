enum Day
{

	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY;
	Day()
	{
		System.out.println("i AM CONSTRUCTOR");
	}
}
public class EnumExample{
	public static void main(String args[]){
		Day d1=Day.WEDNESDAY;
		System.out.println(d1);
		System.out.println("value of tuesday is"+Day.valueOf("TUESDAY"));
		System.out.println("Index of tuesday is"+Day.valueOf("TUESDAY").ordinal());
		for(Day d:Day.values())
		{
			System.out.println(d);
		}
	}
}