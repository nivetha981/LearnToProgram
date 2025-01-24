import java.util.Scanner;

public class reverseNum {
	public static void rev(int y) {
		int rev = 0; // y=897
		while (y != 0) {
			int rem = y % 10; // =7 89 1
			rev = rev * 10 + rem; // 0*10+7=7 //0+10+89=89 0*10+
			y = y / 10; // 897/10=89 /10=1
		}
		System.out.print("rev is " + rev);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int u = s.nextInt();
		rev(u);

	}

}
