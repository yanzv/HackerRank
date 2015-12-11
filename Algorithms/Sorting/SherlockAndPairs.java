/*
Sherlock and Pairs

Sherlock is given an array of N integers (A0, A1 ... AN−1 by Watson. Now Watson asks Sherlock how many 
different pairs of indices i and j exist such that i is not equal to j but Ai is equal to Aj.

That is, Sherlock has to count the total number of pairs of indices (i,j) where Ai =Aj AND i≠j.

Input Format 
The first line contains T, the number of test cases. T test cases follow. 
Each test case consists of two lines; the first line contains an integer N, the size of array, while 
the next line contains N space separated integers.

Output Format 
For each test case, print the required answer on a different line.

Constraints 
1≤T≤10 
1≤N≤105 
1≤A[i]≤106

Sample input

2
3
1 2 3
3
1 1 2
Sample output

0
2
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndPairs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        for(int i = 0; i < numCases; i++){
            int count = 0;
            int sizeArray = sc.nextInt();
            Map<String,Double> hm = new HashMap();
            sc.nextLine();
            String[]numArray = sc.nextLine().split(" ");
            for (String num:numArray){
                Double number = hm.get(num);
                if(number == null){
                    hm.put(num,new Double(1));
                }else{
                    hm.put(num,number+1);
                }
            }
           
            double total = 0;
            for (Double value : hm.values()) {
                total=total+(value*(value-1));
            }

            System.out.printf("%.0f\n",total);
            
        }
    }
}