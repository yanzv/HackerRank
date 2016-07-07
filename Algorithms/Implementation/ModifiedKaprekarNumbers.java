/* Modified Kaprekar Numbers
https://www.hackerrank.com/challenges/kaprekar-numbers

A modified Kaprekar number is a positive whole number  with  digits, such that when we split 
its square into two pieces - a right hand piece  with  digits and a left hand piece  that contains the remaining  or  digits, the sum of the pieces is equal to the original number (i.e.  +  = ).

Note: r may have leading zeros.

Here's an explanation from Wikipedia about the ORIGINAL Kaprekar Number (spot the difference!): 
In mathematics, a Kaprekar number for a given base is a non-negative integer, the representation of whose square in that base can be split into two parts that add up to the original number again. For instance, 45 is a Kaprekar number, because 45² = 2025 and 20+25 = 45.

The Task 
You are given the two positive integers  and , where  is lower than . Write a program to determine 
how many Kaprekar numbers are there in the range between  and  (both inclusive) and display them all.

Input Format

There will be two lines of input: , lowest value , highest value

Constraints: 


Output Format

Output each Kaprekar number in the given range, space-separated on a single line. 
If no Kaprekar numbers exist in the given range, print INVALID RANGE.

Sample Input

1
100
Sample Output

1 9 45 55 99
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ModifiedKaprekarNumbers {

    static boolean isKaprekarNum2(int num)
    {
        if(num == 1) return true;
        String right = "";
        String left = "";
        String strNum = String.valueOf((long)num*num);
        if(strNum.length() % 2 == 0){
            right = strNum.substring(strNum.length()/2);
            int pos = 0;
            while(pos < right.length()-1 && right.charAt(pos) == '0') pos++;
            right = right.substring(pos);
            if(right.charAt(0) == '0') right = right.substring(1);
            left = strNum.substring(0,strNum.length()/2);
        }else{
            right = strNum.substring((int)Math.ceil(strNum.length()/2.0)-1);
            if(right.length()>0){
                int pos = 0;
                while(pos < right.length() && right.charAt(pos) == '0') pos++;
                right = right.substring(pos);
            }
            left = strNum.substring(0,(int)Math.ceil(strNum.length()/2.0)-1);
                    

        }
        if(right.length() < 1 || left.length() < 1 || right.charAt(0) == '0') return false;
        
        return Integer.parseInt(right)+Integer.parseInt(left) == num;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int lastNum = sc.nextInt();
        boolean isKaprekarNum = false;
        for(int i = firstNum;i <= lastNum;i++){
            if(isKaprekarNum2(i)){
                System.out.print(i+" ");
                isKaprekarNum = true;
            }  
        }
        System.out.println(isKaprekarNum?"":"INVALID RANGE");
       
    }
}