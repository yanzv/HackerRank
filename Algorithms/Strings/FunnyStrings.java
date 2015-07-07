/* Funny Strings
Suppose you have a string S which has length N and is indexed from 0 to N−1. String R is the reverse of the string S. The string S is funny if the condition |Si−Si−1|=|Ri−Ri−1| is true for every i from 1 to N−1.

(Note: Given a string str, stri denotes the ascii value of the ith character (0-indexed) of str. |x| denotes the absolute value of an integer x)

Input Format

First line of the input will contain an integer T. T testcases follow. Each of the next T lines contains one string S.

Constraints

1<=T<=10
2<=length of S<=10000
Output Format

For each string, print Funny or Not Funny in separate lines.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyStrings {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        boolean isFunny = true;
        for(int i = 0;i<testCases;i++){
            String str = sc.nextLine();
            for(int j=0;j<str.length()-1;j++){
                int val1 = Math.abs(Character.getNumericValue(str.charAt(str.length()-2-j))-Character.getNumericValue(str.charAt(str.length()-1-j)));
                int val2 = Math.abs(Character.getNumericValue(str.charAt(j+1))-Character.getNumericValue(str.charAt(j)));
                if(val1!=val2){
                    isFunny = false;
                    break;
                }
            }
            System.out.println(isFunny?"Funny":"Not Funny");
            isFunny = true;    

        }
    }
}