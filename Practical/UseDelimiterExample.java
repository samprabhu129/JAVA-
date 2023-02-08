import java.util.Scanner;

public class UseDelimiterExample{
    public static void main(String args[]){
		Scanner sc = new Scanner("Ramesh is a good boy");
		sc.useDelimiter("\\s");
		while(sc.hasNext())
		{
			System.out.println(sc.next());
			
		}
}
}