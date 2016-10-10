/*
Jumping On The Clouds Revisited
https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JumpingOnTheCloudsRevisited {

    public static int energyLeft(int[] cloudsArray, int jumpDistance)
    {
        int currentPos = 0;
        int energyLeft = 100;
   
        do{
            currentPos = (currentPos + jumpDistance) % cloudsArray.length;
            energyLeft--;
            if(cloudsArray[currentPos] == 1) energyLeft-=2;
        }while (currentPos != 0);
        
        return energyLeft;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        System.out.println(energyLeft(c,k));
    }
}