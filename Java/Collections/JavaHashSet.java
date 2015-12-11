/* Java Hashset

In computer science, a set is an abstract data type that can store certain values, without any particular order, 
and no repeated values(Wikipedia). {1,2,3} is an example of a set, but {1,2,2} is not a set. Today you will learn 
how to use sets in java by solving this problem.

You are given n pairs of strings. Two pairs (a,b) and (c,d) are identical if a=c and b=d. That also implies (a,b) 
is not same as (b,a). After taking each pair as input, you need to print number of unique pairs you currently have.

Note: Brute force solution will not earn full points.

Hints: Solve Java Comparator problem first!

Input Format

In the first line, there will be an integer T denoting number of pairs. Each of the next T lines will contain two 
strings seperated by a single space.

Constraints:
1<=T<=100000
Length of each string is atmost 5 and will consist lower case letters only.
The testcases were generated randomly.

Output Format

Print T lines. In the ith line, print number of unique pairs you have after taking ith pair as input.

Sample Input

5
john tom
john mary
john tom
mary anna
mary anna

Sample Output

1
2
2
3
3
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaHashSet 
{

    public static void main(String[] args) {

        HashSet  hs = new HashSet ();
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < numCases;i++){
            if(hs.add(sc.nextLine())){
                count++;
            }
            System.out.println(count);
        }
        
    }
}