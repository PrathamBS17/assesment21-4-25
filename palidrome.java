package assesment;

import java.util.Scanner;

public class palidrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int original = num;
		int reverse = 0;
		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;

		}
		if (original == reverse) {
			System.out.println(original + "is a Pallindrome");
		} else {
			System.out.println(original + "s not a Pallindrome");
		}

	}
}
