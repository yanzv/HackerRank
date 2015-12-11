/*
Mark And Toys

Mark and Jane are very happy after having their first kid. Their son is very fond of toys, so Mark wants to buy some. There are N different toys lying in front of him, tagged with their prices, but he has only $K. He wants to maximize the number of toys he buys with this money.

Now, you are Mark's best friend and have to help him buy as many toys as possible.

Input Format 
The first line contains two integers, N and K, followed by a line containing N space separated integers indicating the products' prices.

Output Format 
An integer that denotes maximum number of toys Mark can buy for his son.

Constraints 
1<=N<=105 
1<=K<=109 
1<=price of any toy<=109 
A toy can't be bought multiple times.

Sample Input

7 50
1 12 5 111 200 1000 10
Sample Output

4
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarkAndToys {
    public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt(),k=stdin.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++) prices[i]=stdin.nextInt();
        
        int answer = 0;
        Arrays.sort(prices);
        
        int sum = 0;
        int i = 0;
        while(sum <=k){
            sum+=prices[i++];
        }
        System.out.println(i-1);
    }
}