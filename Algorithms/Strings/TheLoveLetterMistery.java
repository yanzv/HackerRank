/*The Love-Letter Mystery

James found a love letter his friend Harry has written for his girlfriend. James is a prankster, 
so he decides to meddle with the letter. He changes all the words in the letter into palindromes.

To do this, he follows two rules:

He can reduce the value of a letter, e.g. he can change d to c, but he cannot change c to d.
In order to form a palindrome, if he has to repeatedly reduce the value of a letter, he can do it until 
the letter becomes a. Once a letter has been changed to a, it can no longer be changed.
Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations 
required to convert a given string into a palindrome.

Input Format

The first line contains an integer T, i.e., the number of test cases. 
The next T lines will contain a string each. The strings do not contain any spaces.

Constraints 
1≤T≤10 
1≤ length of string ≤104 
All characters are lower case English letters.

Output Format

A single line containing the number of minimum operations corresponding to each test case.

Sample Input

4
abc
abcba
abcd
cba
Sample Output

2
0
4
2
*/

import java.io.*;
import java.util.*;

public class TheLoveLetteryMistery {

    public static int minOperations(String word)
    {
        int count = 0;
        for(int i = 0;i<(int)word.length()/2;i++){
            count += Math.abs((word.charAt(i) - '0') - (word.charAt(word.length()-1-i) - '0'));
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        int numTestCases = Integer.parseInt(sc.nextLine());
        for(int i=0; i<numTestCases;i++){
            System.out.println(minOperations(sc.nextLine()));
        }
    }
}