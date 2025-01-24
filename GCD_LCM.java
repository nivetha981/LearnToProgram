import java.util.Scanner;

public class GCD_LCM {

	// Function to find GCD using Euclid's algorithm
	public static int findGCD(int a, int b) {
		while(b!=0)
		{
			int temp=b; //t=8
			b=a%b;  //8=8%8 =1
			a=temp; //
		}
		return a;
	}

	// Function to find LCM using the formula LCM(a, b) = (a * b) / GCD(a, b)
	public static int findLCM(int a, int b) {
		return (a * b) / findGCD(a, b);
	}

	// Function to find GCD of more than two numbers
	public static int findGCDOfArray(int[] numbers) {
		int gcd = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			gcd = findGCD(gcd, numbers[i]);
		}
		return gcd;
	}

	// Function to find LCM of more than two numbers
	public static int findLCMOfArray(int[] numbers) {
		int lcm = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			lcm = findLCM(lcm, numbers[i]);
		}
		return lcm;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input number of elements
		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		int numbers[] = new int[n];

		// Input the elements
		System.out.println("Enter " + n + " numbers:");
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}

		// Find GCD and LCM of the array
		int gcdResult = findGCDOfArray(numbers);
		int lcmResult = findLCMOfArray(numbers);

		// Output the results
		System.out.println("GCD of the given numbers is: " + gcdResult);
		System.out.println("LCM of the given numbers is: " + lcmResult);
	}
}
