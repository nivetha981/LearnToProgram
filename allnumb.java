import java.util.Scanner;

public class allnumb {
	public static void primenum(int n) {
		int flag = 0;
		if (n == 1) {
			System.out.println("nor prime nor integer");
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(n + " is prime");
		} else {
			System.out.println(n + " is not a prime");
		}
	}

	public static void oddReven(int n) {
		if (n % 2 == 0) {
			System.out.println(n + " is even ");
		} else {
			System.out.println(n + " is odd");
		}
	}

	public static void amstrong(int n) {
		int orgNum, rem, res = 0;
		orgNum = n;
		while (orgNum != 0) {
			rem = orgNum % 10;
			res += Math.pow(rem, 3);
			orgNum = orgNum / 10;
		}
		if (res == n) {
			System.out.println(n + " is armstrong");
		} else {
			System.out.println(n + " is not armstrong");
		}
	}

	public static void palindrom(int n) {
		int rev = 0, rem = 0, temp;
		temp = n;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp /= 10;
		}
		System.out.println("Reversed number of " + n + " is " + rev);
	}

	public static void power(int n, int i) {
		double num = Math.pow(n, i);
		System.out.println("The power of " + n + " base " + i + " is " + num);
	}

	public static void square(int n) {
		int res = n * n;
		System.out.println("The square of " + n + " is " + res);

	}

	public static void cube(int n) {
		int res = n * n * n;
		System.out.println("The cube of " + n + " is " + res);
	}

	public static void s_root(int n) {

		System.out.println("The square root of " + n + " is " + Math.sqrt(n));
	}

	public static void perfect(int n) {
		int sum = 1;
		if (n == 1) {
			System.out.print(n + "is not a perfect number");
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			System.out.println(n + " is perfect number");
		} else {
			System.out.println(n + " is not perfect number");
		}
	}

	public static void absolute(int n) {
		System.out.println("The absolute  value of " +n+ " is " + Math.abs(n));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enter num : ");
		int n = s.nextInt();
		System.out.print("enter i : ");
		int i = s.nextInt();
 
		primenum(n);
		oddReven(n);
		amstrong(n);
		perfect(n);
		palindrom(n);
		power(n, i);
		square(n);
		cube(n);
		s_root(n);
		absolute(n);
		s.close();
	}
}
