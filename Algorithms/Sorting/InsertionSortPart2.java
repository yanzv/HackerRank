/* Insertion Sort Part 2
In Insertion Sort Part 1, you sorted one element into an array. Using the same approach repeatedly, can you sort an entire unsorted array?

Guideline: You already can place an element into a sorted array. How can you use that code to build up a sorted array, one element at a time? Note that in the first step, when you consider an element with just the first element - that is already "sorted" since there's nothing to its left that is smaller.

In this challenge, don't print every time you move an element. Instead, print the array after each iteration of the insertion-sort, i.e., whenever the next element is placed at its correct position.

Since the array composed of just the first element is already "sorted", begin printing from the second element and on.

Input Format 
There will be two lines of input:

s - the size of the array
ar - a list of numbers that makes up the array
Output Format 
On each line, output the entire array at every iteration.
*/

import java.io.*;
import java.util.*;

public class InsertionSortPart2 {

    public static void insertionSortPart2(int[] ar)
    {       
           // Fill up the code for the required logic here
           // Manipulate the array as required
           // The code for Input/Output is already provided
        int pos = 1;
        while (pos < ar.length){
            int currentPos = pos;
            for(int i = pos-1; i>=0;i--){
                if(ar[currentPos]<ar[i]){
                    //insert the value
                    int temp = ar[currentPos];
                    ar[currentPos] = ar[i];
                    ar[i]=temp;
                    currentPos--;
                }
            }
            pos++;
            printArray(ar);
        }
    }  
    
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
