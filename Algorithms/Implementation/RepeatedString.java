/* 
Reapeated Strings
https://www.hackerrank.com/challenges/repeated-string
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RepeatedString {

    public static long calcNumAInString(String s, long numChar)
    {
        long count = 0;
        
        for(int i = 0;i < numChar;i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }    
        return count;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        
        
        
        if(s.length() > n){
            System.out.println(calcNumAInString(s,n));
        }else{
            long count = calcNumAInString(s,s.length()) * (n / s.length());
            long numCharLeft = n % s.length();
            count += calcNumAInString(s,numCharLeft);
            System.out.println(count);
        }
        
    }
}