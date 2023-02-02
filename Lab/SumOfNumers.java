public class SumOfNumers {
public static void main(String[] args) {
int sum = 0;
System.out.println("Even Numbers:");
for (int i = 2; i <= 200; i += 2) {
System.out.print(i + " ");
sum += i;
}
System.out.println();
System.out.println("Odd Numbers:");
for (int i = 1; i <= 200; i += 2) {
System.out.print(i + " ");
sum += i;
}
System.out.println();
System.out.println("Sum of natural numbers from 1 to 200: " + sum);
}
}




