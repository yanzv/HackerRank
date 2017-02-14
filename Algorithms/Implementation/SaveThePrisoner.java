//https://www.hackerrank.com/challenges/save-the-prisoner

/*
 A jail has N prisoners, and each prisoner has a unique id number, S, ranging from 1 to N. There are M sweets that must be distributed to the prisoners.

 The jailer decides the fairest way to do this is by sitting the prisoners down in a circle (ordered by ascending ), and then, starting with some random S,
 distribute one candy at a time to each sequentially numbered prisoner until all M candies are distributed. 
 For example, if the jailer picks prisoner S = 2, then his distribution order would be (2,3,4,5....,n-1,n,1,2,3,4...) until all sweets are distributed.

 But wait—there's a catch—the very last sweet is poisoned! Can you find and print the ID number of the last prisoner to receive a sweet so he can be warned?

 Input Format

 The first line contains an integer, T, denoting the number of test cases.
 The T subsequent lines each contain 3 space-separated integers:
 N(the number of prisoners), M(the number of sweets), and S(the prisoner ID), respectively.

 Constraints
   - 1 <= T <= 100
   - 1 <= N <= 10^9
   - 1 <= M <= 10^9
   - 1 <= S <= 10^9

 Output Format

 For each test case, print the ID number of the prisoner who receives the poisoned sweet on a new line.

 Sample Input

 1 
 5 2 1

 Sample Output

 2

 Explanation

 There are N = 5 prisoners and M = 2 sweets. Distribution starts at ID number S = 1, so prisoner 1 gets the first sweet and prisoner 2 gets the second (last) sweet. Thus, we must warn prisoner 2 about the poison, so we print 2 on a new line.
 */
import java.util.Scanner;

public class SaveThePrisoner {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int m = in.nextInt();
			int s = in.nextInt();
			int last = s - 1;
			while (m != 0) {
				last++;
				m--;
				if (last > n) {
					last = 1;
				}
			}
			System.out.println(last);
		}
	}
}
