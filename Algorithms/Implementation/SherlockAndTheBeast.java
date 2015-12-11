/* Sherlock And The Beast

Sherlock Holmes suspects his archenemy, Professor Moriarty, is once again plotting something diabolical. 
Sherlock's companion, Dr. Watson, suggests Moriarty may be responsible for MI6's recent issues with their supercomputer, The Beast.

Shortly after resolving to investigate, Sherlock receives a note from Moriarty boasting about infecting 
The Beast with a virus; however, he also gives him a clue—a number, N. Sherlock determines the key to 
removing the virus is to find the largest Decent Number having N digits.

A Decent Number has the following properties:

Its digits can only be 3's and/or 5's.
The number of 3's it contains is divisible by 5.
The number of 5's it contains is divisible by 3.
Moriarty's virus shows a clock counting down to The Beast's destruction, and time is running out fast. 
Your task is to help Sherlock find the key before The Beast is destroyed!

Constraints
1≤T≤20
1≤N≤100000


Input Format

The first line is an integer, T, denoting the number of test cases.

The T subsequent lines each contain an integer, N, detailing the number of digits in the number.

Output Format

Print the largest Decent Number having N digits; if no such number exists, tell Sherlock by printing -1.

Sample Input

4
1
3
5
11

Sample Output

-1
555
33333
55555533333
*/

import java.io.*;
import java.util.*;

public class SherlockAndTheBeast 
{

    public static String createDescentNumber(int fives, int threes)
    {
        String []numArray = new String[fives+threes];
        StringBuilder numString = new StringBuilder();
        for(int i = 0;i<fives;i++){
            numString.append("5");
        }
        for(int i = 0;i<threes;i++){
            numString.append("3");
        }
        return numString.toString();
        
    }
    public static String descentNumber(int n)
    {
        String num = "-1";
        for(int i = n;i >= 0; i--){
            if((i)%3 == 0 && (((n-i))%5) == 0){
                num = createDescentNumber(i,n-i);
                break;
            }else if ((i)%5 == 0 && (((n-i))%3) == 0){
                num = createDescentNumber(i,n-i);
            }
        }
        return num;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numTestCases = Integer.parseInt(sc.nextLine());
        
        for(int i = 0;i < numTestCases; i++){
            int n = sc.nextInt();
            System.out.println(descentNumber(n));
        }
    }
}