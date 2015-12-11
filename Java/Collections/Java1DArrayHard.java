/*
Java 1D Array (Hard)

You are playing a game on your cellphone. You are given an array of length n, indexed from 0 to n−1. 
Each element of the array is either 0 or 1. You can only move to an index which contains 0. At first you are at 
the 0th position. In each move you can do one of the following things:

Walk one step forward or backward.
Make a jump of exactly length m forward.
That means you can move from position x to x+1, x−1 or x+m in one move. The new position must contain 0. 
Also you can move to any position greater than n-1.

You can't move backward from position 0. If you move to any position greater than n−1, you win the game.

Given the array and the length of the jump, you need to determine if it's possible to win the game or not.

Input Format

In the first line there will be an integer T denoting the number of test cases. Each test case will consist of two lines. 
The first line will contain two integers, n and m. On the second line there will be n space-separated integers, each 
of which is either 0 or 1.

Constraints:

1<=T<=5000
2≤n≤100
0≤m≤100
The first integer of the array is always 0.

Output Format

For each case output "YES" if it's possible to win the game, output "NO" otherwise.

Sample Input

4
5 3
0 0 0 0 0
6 5
0 0 0 1 1 1
6 3
0 0 1 1 1 0
3 1
0 1 0

Sample Output

YES
YES
NO
NO
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;

public class Java1DArrayHard 
{

    static boolean didWinGame(String[] gameArray,int jumpLength, int currentPos,int lastJumpPos)
    {

        boolean didWin = false;

        int range = currentPos;

        while(range < gameArray.length-1 && gameArray[range+1].equals("0")){
            range++;
        }
        if(range == gameArray.length-1) return true;

        int lowRange = range;
        while(lowRange>lastJumpPos && gameArray[lowRange-1].equals("0") && (lowRange+jumpLength) > range+1 ){
            lowRange--;
        }
        currentPos = lowRange;
        for(int i = currentPos;i<=range;i++){
            if((i+jumpLength)<gameArray.length && gameArray[i+jumpLength].equals("0")  && jumpLength!=0){
                didWin = didWinGame(gameArray,jumpLength,i+jumpLength,i);
            } 

            if(didWin || (i+jumpLength)>=gameArray.length || (i+1)>=gameArray.length){
                didWin = true;
                break;
            }
        }

        return didWin;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        for(int i=0;i<numCases;i++){
            int arraySize = sc.nextInt();
            int jumpLength = sc.nextInt();
            sc.nextLine();
            String[] gameArray = sc.nextLine().split(" ");
            if(didWinGame(gameArray,jumpLength,0,0)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
            }
        }
    }
}
