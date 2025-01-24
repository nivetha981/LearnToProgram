import java.util.Scanner;

public class powerofnumber {
	public static void pon(int v, int n) {
		double res = Math.pow(v, n);
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int u = s.nextInt();

		System.out.println("enter power");
		int n = s.nextInt();

		pon(u, n);

	}

}
