/*  Beautiful Days at the Movies

https://www.hackerrank.com/challenges/beautiful-days-at-the-movies

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeautifulDaysAtTheMovies {

    public static int reverseNum(int num)
    {
        String numStr = "" + num;
        String reverseNumStr = "";
        
        for(int i = numStr.length() - 1;i >= 0;i--){
            reverseNumStr = reverseNumStr + numStr.charAt(i);
        }
        
        return Integer.parseInt(reverseNumStr);
    }
    
    public static boolean isNumBeautiful(int num, int k)
    {
        return Math.abs(num - reverseNum(num)) % k == 0;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int numOne = sc.nextInt();
        int numTwo = sc.nextInt();
        int k = sc.nextInt();
        int total = 0;
        for(int i = numOne; i <= numTwo; i++){
            if(isNumBeautiful(i,k)) total++;
        }
        System.out.println(total);
    }
}