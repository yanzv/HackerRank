//https://www.hackerrank.com/challenges/divisible-sum-pairs

/*
 You are given an array of n integers, a0,a1,....,a(n-1), and a positive integer, k. Find and print the number of (i,j) pairs where i < j and a(i) + a(j) is evenly divisible by k.

 Input Format

 The first line contains 2 space-separated integers, n and k, respectively.
 The second line contains n space-separated integers describing the respective values of a0, a1,...,a(n-1).

 Constraints
	- 2 <= n <= 100
	- 1 <= k <= 100
	- 1 <= ai <= 100
 Output Format

 Print the number of (i,j) pairs where i < j and ai + aj is evenly divisible by k.

 Sample Input

 6 3
 1 3 2 6 1 2

 Sample Output

 5

 */

import java.util.Scanner;

class DivisibleSumPairs {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int cnt = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((a[i] + a[j]) % k == 0)
					cnt++;
			}
		}
		System.out.println(cnt);
	}
}
