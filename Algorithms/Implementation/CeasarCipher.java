/* Ceasar Cipher

Julius Caesar protected his confidential information by encrypting it in a cipher. Caesar's cipher rotated every letter in a string by a fixed number, K, making it unreadable by his enemies. Given a string, S, and a number, K, encrypt S and print the resulting string.

Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.

Input Format

The first line contains an integer, N, which is the length of the unencrypted string. 
The second line contains the unencrypted string, S. 
The third line contains the integer encryption key, K, which is the number of letters to rotate.

Constraints 
1≤N≤100 
0≤K≤100 
S is a valid ASCII string and doesn't contain any spaces.

Output Format

For each test case, print the encoded string.

Sample Input

11
middle-Outz
2
Sample Output

okffng-Qwvb
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CeasarCipher {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numChars = Integer.parseInt(sc.nextLine());
        char[] inputString = sc.nextLine().toCharArray();
        int rotateValue = sc.nextInt();
        for(int i = 0;i<numChars;i++){
        
            char currentChar = inputString[i];
            if(Character.isLetter(currentChar)){
                char rotatedChar = (char)((int)currentChar+rotateValue%26);
                if(Character.isUpperCase(currentChar)){
                    inputString[i] = ((int)rotatedChar<=90)?rotatedChar:(char)((rotatedChar-(int)'Z')+(int)'A'-1);
                }else{
                    inputString[i] =((int)rotatedChar<=122)?rotatedChar:(char)((rotatedChar-(int)'z')+(int)'a'-1);
                } 
            }
        }
        System.out.println(inputString);
    }
}