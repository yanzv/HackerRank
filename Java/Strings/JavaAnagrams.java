/* Java Anagrams
Two strings A and B are called anagrams if they consist same characters, but may be in different orders. So the list of anagrams of CAT are "CAT", "ACT" , "TAC", "TCA" ,"ATC" and "CTA.

Given two strings, print "Anagrams" if they are anagrams, print "Not Anagrams" if they are not. The strings may consist at most 50 english characters, the comparision should NOT be case sensitive.

This exercise will verify that you are able to sort the characters of a string, or compare frequencies of characters.
*/

import java.io.*;
import java.util.*;


public class JavaAnagrams {

   static boolean isAnagram(String A, String B) {
      //Complete the function
       if(A.length() != B.length()){
           return false;
       }else{
		   // sort the strings and see if they are equal to be considered an Anagram
           char a[] = A.toLowerCase().toCharArray();
           char b[] = B.toLowerCase().toCharArray();
           Arrays.sort(a);
           Arrays.sort(b);
           String sortedA = String.valueOf(a);
           String sortedB = String.valueOf(b);
           if(sortedA.equals(sortedB)){
               return true;
           }
           
        
       }
       return false;
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
