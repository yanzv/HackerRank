/* Java Big Integer

In this problem you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like long integer.

Use the power of Java's BigInteger class and solve this problem.

Input Format

There will be two lines containing two numbers, a and b. The numbers are non-negative and can have maximum 200 digits.

Output Format

Output two lines. The first line should contain a+b, and the second line should contain a×b. Don't print any leading zeros.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String numOne = sc.nextLine();
        String numTwo = sc.nextLine();
        BigInteger bigNumOne = new BigInteger(numOne);
        BigInteger bigNumTwo = new BigInteger(numTwo);
        System.out.println(bigNumOne.add(bigNumTwo));
        System.out.println(bigNumOne.multiply(bigNumTwo));
    }
}