/*
Two Arrays

You are given two integer arrays, A and B, each containing N integers. The size of the array is 
less than or equal to 1000. You are free to permute the order of the elements in the arrays.

Now here's the real question: Is there an permutation A', B' possible of A and B, such that, A'i+B'i ≥ K 
for all i, where A'i denotes the ith element in the array A' and B'i denotes ith element in the array B'.


Input Format
The first line contains an integer, T, the number of test-cases. T test cases follow. Each test case has the following format:

The first line contains two integers, N and K. The second line contains N space separated integers, d
enoting array A. The third line describes array B in a same format.

Output Format
For each test case, if such an arrangement exists, output "YES", otherwise "NO" (without quotes).


Constraints
1 <= T <= 10
1 <= N <= 1000
1 <= K <= 109
0 <= Ai, Bi ≤ 109


Sample Input

2
3 10
2 1 3
7 8 9
4 5
1 2 2 1
3 3 3 4

Sample Output

YES
NO
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numTestCases = Integer.parseInt(sc.nextLine());
        for(int i = 0;i<numTestCases;i++){
            int arraySize = sc.nextInt();
            int kValue = sc.nextInt();
            sc.nextLine();
            int []numArrayA = new int[arraySize];
            int []numArrayB = new int[arraySize];
            for(int k=0;k<arraySize;k++){
                numArrayA[k] = sc.nextInt();
            }
            for(int k=0;k<arraySize;k++){
                numArrayB[k] = sc.nextInt();
            
            }
            Arrays.sort(numArrayA);
            Arrays.sort(numArrayB);
            
            boolean isPossible = true;
            for(int j=0;j<numArrayA.length;j++){
                if(numArrayA[j]+numArrayB[numArrayB.length-1-j] < kValue){
                    isPossible = false;
                    break;
                }
            }
            System.out.println(isPossible?"YES":"NO");
        
        }
    }
}