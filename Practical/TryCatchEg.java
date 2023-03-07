package MY;

public class TryCatchEg {

	public static void main(String[] args) {
		try {//throw exception
			//int num = 88/0;
			//System.out.println(num);
			
			//String num1 = null;
		//	System.out.println(num1.length());
			
			String m ="java";
			int i = Integer.parseInt(m);
			System.out.println(i);
			
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
