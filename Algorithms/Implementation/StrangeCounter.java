//https://www.hackerrank.com/challenges/strange-code

import java.util.Scanner;

class StrangeCounter {
	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		long n = 2;
		while (3 * (n - 1) < t)
			n = 2 * n;
		System.out.println((3 * (n - 1) - t + 1));
	}
}
