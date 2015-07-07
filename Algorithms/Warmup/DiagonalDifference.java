/* Diagonal Difference 
You are given a square matrix of size N×N. Calculate the absolute difference of the sums across the two main diagonals.

Input Format

The first line contains a single integer N. The next N lines contain N integers describing the matrix.

Constraints 
1≤N≤100 
−100≤A[i]≤100
Output Format

Output a single integer equal to the absolute difference in the sums across the diagonals.

Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output

15
Explanation

The first diagonal of the matrix is:

11
    5
        -12
Sum across the first diagonal = 11+5-12= 4

The second diagonal of the matrix is:

        4
    5
10
Sum across the second diagonal = 4+5+10 = 19 
Difference: |4-19| =15
*/

import java.io.*;
import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int length = Integer.parseInt(sc.nextLine());
        int diagonalOne=0, diagonalTwo =0;
        for(int i=0;i<length;i++){
            String[]line = sc.nextLine().split(" ");
            diagonalOne +=Integer.parseInt(line[i]);
            diagonalTwo+=Integer.parseInt(line[line.length-1-i]);
        }
        System.out.println(Math.abs(diagonalOne-diagonalTwo));
    }
}