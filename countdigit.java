public class countdigit {

	public static void main(String[] args) {

		int count = 0, num = 12345;

		while (num != 0) { // 12345!=0
			num = num / 10; // 12345=12345/10=1234
			count++; // c=1
		}

		System.out.println("Number of digits: " + count);
	}
}