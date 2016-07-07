/* Save the Prisoner!
https://www.hackerrank.com/challenges/save-the-prisoner

A jail has  prisoners, and each prisoner has a unique id number, S , ranging from 1 to N .
There are  sweets that must be distributed to the prisoners.

The jailer decides the fairest way to do this is by sitting the prisoners down in a circle (ordered by ascending ), 
and then, starting with some random , distribute one candy at a time to each sequentially numbered prisoner until all  candies are distributed. For example, if the jailer picks prisoner , then his distribution order would be  until all  sweets are distributed.

But wait—there's a catch—the very last sweet is poisoned! Can you find and print the ID number of the last prisoner 
to receive a sweet so he can be warned?

Input Format

The first line contains an integer, T , denoting the number of test cases. 
The T subsequent lines each contain 3 space-separated integers: 
N (the number of prisoners), M (the number of sweets), and S (the prisoner ID), respectively.


Output Format

For each test case, print the ID number of the prisoner who receives the poisoned sweet on a new line.

Sample Input

1 
5 2 1
Sample Output

2
*/

import java.io.*;
import java.util.*;

public class SavethePrisoner {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int numTestCases = sc.nextInt();
        for(int i = 0; i < numTestCases; i++){
            int numPrisoners = sc.nextInt();
            int numCandies = sc.nextInt();
            int startID = sc.nextInt();
            
            if ((startID + numCandies) > numPrisoners) {
                int leftCandies = (startID + numCandies) - numPrisoners - 1;
                System.out.println(leftCandies <= 1 || (leftCandies % numPrisoners) == 0?numPrisoners : (leftCandies % numPrisoners));
            } else {
                System.out.println("" + ((startID + numCandies) - 1) );
            }
        }
        
    }
}