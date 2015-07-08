/* Sum Of Absolutes
You are given an array of integers A and you will be asked to answer some queries.

Function Find(int L,int R)
{
    int sum = 0;
    for ( i = L ; i<= R; i=i+1 )
    {
        sum = abs(sum + A[i]);
    }
    return sum
}
Now Each Query will ask whether the value returned by the function Find is Even or Odd.

Note: abs(x) is x if x>=0 otherwise −1×x.

Input Format 
First Line of Input contains N and Q separated by space. 
Next Line contains N space separated integers. 
Next Q queries follows, each query contains two integers L and R separated by a space.

Constraints 
1≤N≤105 
1≤Q≤105 
−9≤A[i]≤9 
1≤L≤R≤N

Output Format 
For each query output Even if the value returned by Find(L,R) is even otherwise Odd.
*/


import java.io.*;
import java.util.*;

public class SomeOfAbsolute {
    public static String isSumEvenOrOdd(int l,int r,int[]intArray)
    {
        int sum = 0;
        for(int i=l-1;i<r;i++){
            sum+=intArray[i];
        }
        return sum%2==0?"Even":"Odd";
    }
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        int numInt = sc.nextInt();
        int numQueries = sc.nextInt();
        sc.nextLine();
        int[]numArray = new int[numInt];
        for(int i=0;i<numInt;i++){
            numArray[i]=sc.nextInt();
        }
        for(int i=0;i<numQueries;i++){
            sc.nextLine();
            System.out.println(isSumEvenOrOdd(sc.nextInt(),sc.nextInt(),numArray));
        }

        
    }
}