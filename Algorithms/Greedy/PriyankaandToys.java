/*
Priyanka and Toys

Little Priyanka visited a kids' shop. There are N toys and their weight is represented by an array W=[w1,w2,…,wN]. 
Each toy costs 1 unit, and if she buys a toy with weight w′, then she can get all other toys whose weight 
lies between [w′,w′+4] (both inclusive) free of cost.

Input Format

The first line contains an integer N i.e. number of toys.
Next line will contain N integers, w1,w2,…,wN, representing the weight array.

Output Format

Minimum units with which Priyanka could buy all of toys.

Constraints 
1≤N≤105
0≤wi≤104,where i∈[1,N]
Sample Input

5
1 2 3 17 10
Sample Output

3
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PriyankaAndToys {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[]numArray = new int[arraySize];
        for(int i = 0;i<arraySize;i++){
            numArray[i] = sc.nextInt();
        }
       
        Arrays.sort(numArray);
        
        int count = 1;
        int currentToy=numArray[0];
        for(int i = 1;i<numArray.length;i++){
            if(numArray[i]>currentToy+4){
                count++;
                currentToy=numArray[i];
            }
        }
        System.out.println(count);
    }
}