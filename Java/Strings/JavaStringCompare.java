/* Java String Compare

Given a string, find out the lexicographically smallest and largest substring of length k.

[Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", "dog" is smaller 
than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]

Input Format

First line will consist a string containing english alphabets which has at most 1000 characters. 
2nd line will consist an integer k.

Output Format

In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int length = sc.nextInt();
        String smallest="";
        String largest="";
        for(int i = 0;i<=inputString.length()-length;i++){
            String subString = inputString.substring(i,i+length);
            if(i == 0){
                smallest = subString;
            }
            if(subString.compareTo(largest)>0){
                largest = subString;
            }else if(subString.compareTo(smallest)<0)
                smallest = subString;
        }
        System.out.println(smallest);
        System.out.println(largest);
        
    }
}