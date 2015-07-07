/* Alternating Characters
Shashank likes strings in which consecutive characters are different. For example, he likes ABABA, while he doesn't like ABAA. Given a string containing characters A and B only, he wants to change it into a string he likes. To do this, he is allowed to delete the characters in the string.

Your task is to find the minimum number of required deletions.

Input Format

The first line contains an integer T, i.e. the number of test cases. 
The next T lines contain a string each.

Output Format

For each test case, print the minimum number of deletions required.

Constraints

1≤T≤10 
1≤ length of string ≤10^5
*/

import java.io.*;
import java.util.*;

public class AlternatingCharacters {

    public static int consecutiveChars(String str)
    {
        StringBuilder mutableStr = new StringBuilder(str);
        int numDeletions = 0;
        int pos = 0;
        while(pos<mutableStr.length()-1){
            if(mutableStr.charAt(pos)==mutableStr.charAt(pos+1)){
                mutableStr.deleteCharAt(pos);
                numDeletions++;
            }else{
                pos++;
            }
        }
        
        
        return numDeletions;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        for(int i=0;i<numCases;i++){
            System.out.println(consecutiveChars(sc.nextLine()));
        }
    }
}
