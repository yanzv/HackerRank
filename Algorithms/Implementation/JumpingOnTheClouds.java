/*
Jumping on the Clouds
https://www.hackerrank.com/challenges/jumping-on-the-clouds
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int minJumps(int[] cloudsArray)
    {
        int currentPos = 0;
        int jumpsCount = 0;
   
        while (currentPos < cloudsArray.length-1){
            if(currentPos + 2 < cloudsArray.length && cloudsArray[currentPos + 2] == 0){
                currentPos+=2;
                jumpsCount++;
            } else {
                currentPos++;
                jumpsCount++;
            }
        }
        return jumpsCount;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        System.out.println(minJumps(c));
    }
}