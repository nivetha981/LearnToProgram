import java.util.Scanner;

public class firstlastNum {
	public static void lastNumber(int y) {
		int u = y % 10;
		System.out.println(u);
	}

	public static void firstNumber(int y) {
		while (y > 12) {
			y = y / 10; // 23/10=2.3=2
		}
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter num");
		int n = s.nextInt();
		firstNumber(n);
		lastNumber(n);

	}

}
