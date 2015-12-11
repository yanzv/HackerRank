/* Cut The Sticks

You are given N sticks, where the length of each stick is a positive integer. A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.

Suppose we have six sticks of the following lengths:

5 4 4 2 2 8
Then, in one cut operation we make a cut of length 2 from each of the six sticks. For the next cut 
operation four sticks are left (of non-zero length), whose lengths are the following:

3 2 2 6
The above step is repeated until no sticks are left.

Given the length of N sticks, print the number of sticks that are left before each subsequent cut operations.

Note: For each cut operation, you have to recalcuate the length of smallest sticks (excluding zero-length sticks).

Input Format 
The first line contains a single integer N. 
The next line contains N integers: a0, a1,...aN-1 separated by space, where ai represents the length of ith stick.

Output Format 
For each operation, print the number of sticks that are cut, on separate lines.

Constraints 
1 ≤ N ≤ 1000 
1 ≤ ai ≤ 1000

Sample Input #00

6
5 4 4 2 2 8
Sample Output #00

6
4
2
1
Sample Input #01

8
1 2 3 4 3 3 2 1

Sample Output #01

8
6
4
1
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> sticks = new ArrayList<Integer>();
        int numSticks = Integer.parseInt(sc.nextLine());
        for(int i = 0;i<numSticks;i++){
            sticks.add(new Integer(sc.nextInt()));
        }
        while(sticks.size()>0){
            Collections.sort(sticks);
            int shortestStick = sticks.get(0);
            
            int pos = 0;
            System.out.println(sticks.size());
            while(pos<sticks.size()){
                int num = sticks.get(pos);
                num-=shortestStick;
                if(num>0){
                    sticks.set(pos,num);
                    pos++;
                }else{
                    sticks.remove(pos);
                
                }
            
            }  
            
           
        }
    }
}