/*
 * https://www.hackerrank.com/challenges/camelcase
 * Alice wrote a sequence of words in CamelCase as a string of letters, , having the following properties:
	- It is a concatenation of one or more words consisting of English letters.
    - All letters in the first word are lowercase.
    - For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.

Given , print the number of words in s on a new line.

Input Format

A single line containing string .

Constraints

Output Format

Print the number of words in string .

Sample Input

saveChangesInTheEditor

Sample Output

5

Explanation

String s contains five words:
    save
    Changes
    In
    The
    Editor

Thus, we print 5 on a new line.
*/

import java.util.Scanner;

public class CamelCase {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		String str = in.nextLine();
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (Character.isUpperCase(arr[i])) {
				count++;
			}
		}
		// First word's letter will not be in upper case. So, we have to add +1 in final answer
		System.out.println(count + 1);
	}
}
