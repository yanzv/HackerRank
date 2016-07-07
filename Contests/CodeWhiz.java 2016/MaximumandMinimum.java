/* Maximum and Minimum

The locked code in your editor passes array  (of size ) and index  to the print method, whose try 
block attempts to print element ; if  is Out-of-Range, an Array Index Out Of Bounds Exception is thrown.

Complete the code in your editor so that it prints the maximum and minimum elements in array 
regardless of whether or not an exception is thrown.

Input Format

The first line contains an integer, , the number of elements in . 
The second line contains  space-separated integers describing . 
The third line contains an index, , to be accessed.

Note: Input from stdin handled by the locked code in the editor.

Constraints



Output Format

The try block will print the value accessed at ; if an Exception is thrown, it will be printed by
the locked code in your editor. 
You must print the respective maximum and minimum values in array  as a single pair of space-separated integers 
on a new line—regardless of whether an exception is thrown.

Note: Observe that your max/min values may print on either the first or second line, depending on 
whether or not an Exception was thrown!

Sample Input 0

12
-12 0 1 -899 23 45 96 10 75 23 0 33
100
Sample Output 0

96 -899
java.lang.ArrayIndexOutOfBoundsException
Sample Input 1

10
4 908 -05 445 -208 325 -2 -718 863 400
9   
Sample Output 1

400
908 -718

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaximumandMinimum
{

	public static void print(int A[],int i)
	{
    	try{
                System.out.println(A[i]);
            }
            catch(ArrayIndexOutOfBoundsException e){
            int max = A[0];
            int min = A[0];
            for(int j = 0;j < A.length;j++){
                if(max < A[j]) max = A[j];
                if(min > A[j]) min = A[j];
            }
            System.out.println(max+" "+min);
            throw e;
        }
        int max = A[0];
        int min = A[0];
        for(int j = 0;j < A.length;j++){
            if(max < A[j]) max = A[j];
            if(min > A[j]) min = A[j];
        }
        System.out.println(max+" "+min);
	}

    public static void main(String[] args) {
        int N;
        Scanner st=new Scanner(System.in);
        N=st.nextInt();
        int A[]=new int[N];
        for(int i=0;i<N;i++)
        {
           A[i]=st.nextInt();
        }
        int i=st.nextInt();
        try
        {
            print(A,i);

        }
        catch(Exception e){
            System.out.println(e.getClass().getName());
        }
        
   }// end of main
}