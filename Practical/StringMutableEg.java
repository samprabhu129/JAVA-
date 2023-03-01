package MY;

public class StringMutableEg {

	public static void main(String[] args) {
		StringBuffer b1 = new StringBuffer("Anudip");
		b1.append(" vashi");
		System.out.println(b1);
		b1.replace(2, 4, "sa");
		System.out.println(b1);
		b1.insert(1, "sam");
		System.out.println(b1);
		b1.delete(1, 4);
		System.out.println(b1);

	}

}
