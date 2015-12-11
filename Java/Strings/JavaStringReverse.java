/* Java String Reverse

Problem Statement

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
Given a string A, print "Yes" if it is a palindrome, print "No" otherwise. The strings will consist lower case english letters only. 
The strings will have at most 50 characters.

Some examples of palindromes are "madam", "anna", "reviver".

Sample Input

madam
Sample Output

Yes
*/

import java.io.*;
import java.util.*;

public class JavaStringReverse {
    
    public static boolean isPalindrome(String word)
    {
        boolean isPalindrome = true;
        
        for(int i = 0;i<(int)word.length()/2;i++)
        {
            if(word.charAt(i) != word.charAt(word.length()-1-i)){
                isPalindrome = false;
                break;
                
            }
        }
            
        return isPalindrome;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();  
        System.out.println(isPalindrome(A)?"Yes":"No");
        
    }
}