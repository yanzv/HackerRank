//https://www.hackerrank.com/challenges/beautiful-binary-string
/*
 Alice has a binary string, B, of length n. She thinks a binary string is beautiful if and only if it doesn't contain the substring "010".

 In one step, Alice can change a 0 to a 1 (or vice-versa). Count and print the minimum number of steps needed to make Alice see the string as beautiful.

 Input Format

 The first line contains an integer, (the length of binary string B).
 The second line contains a single binary string, B, of length n.

 Constraints

 1 <= n <= 100
 Each character in B belongs to {1,2} .

 Output Format

 Print the minimum number of steps needed to make the string beautiful.

 Sample Input 0

 7
 0101010

 Sample Output 0

 2

 Sample Input 1

 5
 01100

 Sample Output 1

 0

 Sample Input 2

 10
 0100101010

 Sample Output 2

 3
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BeautifulBinaryString {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		final int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		final String stringToBeFound = "010";
		int lastIndex = 0;
		while (lastIndex != -1) {
			lastIndex = str.indexOf(stringToBeFound, lastIndex);
			if (lastIndex != -1) {
				count++;
				lastIndex += stringToBeFound.length();
			}
		}
		System.out.println(count);
	}
}
