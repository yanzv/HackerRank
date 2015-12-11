/*Gem Stones

John has discovered various rocks. Each rock is composed of various elements, and each element is 
represented by a lower-case Latin letter from 'a' to 'z'. An element can be present multiple times in a rock. An element is called a gem-element if it occurs at least once in each of the rocks.

Given the list of N rocks with their compositions, display the number of gem-elements that exist in those rocks.

Input Format

The first line consists of an integer, N, the number of rocks. 
Each of the next N lines contains a rock's composition. Each composition consists of lower-case 
letters of English alphabet.

Constraints 
1≤N≤100 
Each composition consists of only lower-case Latin letters ('a'-'z'). 
1≤ length of each composition ≤100
Output Format

Print the number of gem-elements that are common in these rocks. If there are none, print 0.

Sample Input

3
abcdde
baccd
eeabg

Sample Output

2
*/

import java.io.*;
import java.util.*;

public class GemStones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> dict = new HashMap<String, Integer>();
        int numTestCases = Integer.parseInt(sc.nextLine());
        for(int i = 0;i<numTestCases;i++){
            String word = sc.nextLine();
            for(int j = 0; j<word.length();j++){
                if(i==0){
                    dict.put(""+word.charAt(j),new Integer(1));
                }else{
                    Integer val = dict.get(""+word.charAt(j));
                    if(val != null && val == i){
                        val+=1;
                        dict.put(""+word.charAt(j),val);
                    }
                }
            }
            
        }
        int count = 0;
        for(Integer val:dict.values()){
            if(val == numTestCases) count++;
        }
        System.out.println(count);
    }
}