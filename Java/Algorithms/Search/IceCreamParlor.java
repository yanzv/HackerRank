/* Ice Cream Parlor

Sunny and Johnny together have M dollars they want to spend on ice cream. The parlor offers N flavors, and they want to choose two flavors so that they end up spending the whole amount.

You are given the cost of these flavors. The cost of the ith flavor is denoted by ci. You have to display the indices of the two flavors whose sum is M.

Input Format

The first line of the input contains T; T test cases follow. 
Each test case follows the format detailed below: The first line contains M. The second line contains N. The third line contains N space-separated integers denoting the price of each flavor. Here, the ith integer denotes ci.

Output Format

Output two integers, each of which is a valid index of a flavor. The lower index must be printed first. Indices are indexed from 1 to N.

*/

import java.io.*;
import java.util.*;

public class IceCreamParlor {

    public static void printCombination(ArrayList listArray, int money)
    {
        int startPos = 0;
        while(startPos<listArray.size()-1){
            for(int i = startPos+1;i<listArray.size();i++){
                int sum = (int) listArray.get(startPos)+(int) listArray.get(i);
                if(sum == money){
                    System.out.println((startPos+1)+" "+(i+1));
                    return;
                }
            }
            startPos++;
        }
     
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numTestCases = sc.nextInt();
        
        for(int i = 0;i<numTestCases;i++){
            int money = sc.nextInt();
            int numFlavors = sc.nextInt();
            ArrayList<Integer> costArrayList = new ArrayList<Integer>();
            for(int j = 0; j<numFlavors;j++){
                costArrayList.add(sc.nextInt());
            }
            printCombination(costArrayList,money);
            
        }
    }
}