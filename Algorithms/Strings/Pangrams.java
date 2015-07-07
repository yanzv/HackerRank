/* Pangrams
Roy wanted to increase his typing speed for programming contests. So, his friend advised him to type the sentence "The quick brown fox jumps over the lazy dog" repeatedly, because it is a pangram. (Pangrams are sentences constructed by using every letter of the alphabet at least once.)

After typing the sentence several times, Roy became bored with it. So he started to look for other pangrams.

Given a sentence s, tell Roy if it is a pangram or not.

Input Format Input consists of a line containing s.

Constraints 
Length of s can be at most 103 (1≤|s|≤103) and it may contain spaces, lower case and upper case letters. Lower case and upper case instances of a letter are considered the same.

Output Format Output a line containing pangram if s is a pangram, otherwise output not pangram.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangrams {

    public static void main(String[] args) {
        
        ArrayList<String>alphabet = new ArrayList<String>(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
        alphabet.remove(0);
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().toLowerCase();
        
        for(int i=0;i<sentence.length();i++){
            if(!alphabet.isEmpty()){
                alphabet.remove(""+sentence.charAt(i));
            }else{
                break;
            }
        }
        System.out.println(alphabet.isEmpty()?"pangram":"not pangram");                                       
    }
}