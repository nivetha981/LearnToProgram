import java.util.Scanner;

public class evenorOdd {
	public static void evenodd(int n) {
		if (n % 2 == 0) {
			System.out.println(n + " is even");
		} else {
			System.out.println(n + " is odd");
		}
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number :");
		int n = s.nextInt();
		evenodd(n);

	}
}