/*
Kangaroo
https://www.hackerrank.com/challenges/kangaroo
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

    public static String willTheyMeat(int firstPos, int firstDistance, int secondPos, int secondDistance)
    {
        if (firstPos == secondPos) return "YES";
        
        while(firstPos < secondPos){
            firstPos+=firstDistance;
            secondPos+=secondDistance;
            if(firstPos == secondPos) return "YES";   
        }
        
        return "NO";
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        if(x1 <= x2 && v1 >= v2){
            System.out.println(willTheyMeat(x1,v1,x2,v2));
        } else if (x2 <= x1 && v2 >= v1){
            System.out.println(willTheyMeat(x2,v2,x1,v1));
        } else {
            System.out.println("NO");
        }
        
    }
}