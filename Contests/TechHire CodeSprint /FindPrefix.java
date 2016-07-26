
/* Find Prefix

Lea is building a search engine. She just implemented a predictive feature that shows all possible search 
results when the first few characters of a search term are typed. She modified this problem slightly and 
turned it into a HackerRank challenge! Your task is as follows:

Given q queries where each query is a list of n strings, reverse the functionality of Lea's search 
feature by finding the longest common prefix for any two strings in the list and print its length on a new 
line. If no two strings share a common prefix, print 0 instead.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class FindPrefix {

    public static int lengthOfLCP(String[] words)
    {
        if(words.length == 1) {
            return 0;
        }
        
        int maxLength = 0;
        
        Arrays.sort(words);
        for(int i = 0; i < words.length; i++){
            for(int j = i+1; j < words.length; j++){
                if(words[i].charAt(0) != words[j].charAt(0)){
                    break;
                }
                int tempMaxLength = 0;
                for(int k = 0; k < Math.min(words[i].length(), words[j].length()); k++){
                    if(words[i].charAt(k) == words[j].charAt(k)) {
                        tempMaxLength++;
                    } else {
                        break;
                    }
                }
                maxLength = Math.max(maxLength,tempMaxLength);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numQueries = sc.nextInt();
        for(int i = 0;i < numQueries;i++){
            int numWords = sc.nextInt();
            sc.nextLine();
            String[] words = new String[numWords];
            for(int j = 0; j < numWords; j++){
                words[j] = sc.nextLine();
            }
            System.out.println(lengthOfLCP(words));
        }
    }
}