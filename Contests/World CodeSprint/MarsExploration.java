/* Mars Exploration

Sami's spaceship crashed on Mars! She sends  sequential SOS messages to Earth for help.


Letters in some of the SOS messages are altered by cosmic radiation during transmission. 
Given the signal received by Earth as a string, , determine how many letters of Sami's SOS have been changed by radiation.

Input Format

There is one line of input: a single string, .

Note: As the original message is just SOS repeated  times, 's length will be a multiple of .

Constraints 


 will contain only uppercase English letters.

Output Format

Print the number of letters in Sami's message that were altered by cosmic radiation.

Sample Input 1

SOSSPSSQSSOR
Sample Output 1

3
Sample Input 2

SOSSOT
Sample Output 2

1

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarsExploration
{

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int pos = 0;
        int numAltered = 0;
        while(pos < S.length()){
            if(S.charAt(pos) != 'S') numAltered++;
            if(S.charAt(pos+1) != 'O') numAltered++;
            if(S.charAt(pos+2) != 'S') numAltered++;
            pos+=3;
        }
        System.out.println(numAltered);
    }
}