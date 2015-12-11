/* Extra Long Factorials

You are given an integer N. Print the factorial of this number.

N!=N×(N−1)×(N−2)×⋯×3×2×1
Input 
Input consists of a single integer N, where 1≤N≤100.

Output 
Print the factorial of N.

Example 
For an input of 25, you would print 15511210043330985984000000.

Note: Factorials of N>20 can't be stored even in a 64−bit long long variable. 
Big integers must be used for such calculations. Languages like Java, Python, Ruby etc. can handle 
big integers, but we need to write additional code in C/C++ to handle huge values.

We recommend solving this challenge using BigIntegers.


*/

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class ExtraLongFactorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int factorialNum = sc.nextInt();
        BigInteger bigInt = new BigInteger(""+factorialNum);
        for(int i = 1;i<factorialNum;i++){
            bigInt=bigInt.multiply(new BigInteger(""+(factorialNum-i)));
        }
        System.out.println(bigInt);
        
    }
}