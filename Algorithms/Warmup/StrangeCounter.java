/*
Strange Counter

https://www.hackerrank.com/challenges/strange-code

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StrangeCounter {
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long  t = in.nextLong();
        
        int time = 1;
        long counter = 3;
        while(time + counter <= t){
            time += counter;
            counter *=2;
        }
        System.out.println(counter - (t - time));
    }
}