enum TrafficSignal
{
    RED("stop"),
    GREEN("GO"),
    YELLOW("SLOW DOWN");
	String action;
	
	public String getAction(){
		return action;
	}
	TrafficSignal(String action)
	{
	    this.action=action;
	}

}
public class TestEnum{
       public static void main(String args[]){
	      TrafficSignal ts = TrafficSignal.YELLOW;
		  System.out.println(ts);
	   }
}