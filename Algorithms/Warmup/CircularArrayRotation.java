/*
Circular Array Rotation

https://www.hackerrank.com/challenges/circular-array-rotation
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CircularArrayRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int offset = k > a.length - 1  ? k % a.length : k;

        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            int pos = m - offset;
            if(pos < 0){
                pos = a.length + pos;
            }
            System.out.println(a[pos]);
        }
        
    }
}

