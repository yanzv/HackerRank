/*  Mini-Max Sum

https://www.hackerrank.com/challenges/mini-max-sum

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiniMaxSum  
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long total = 0;
        long max = 0;
        long min = Long.MAX_VALUE;
        while(in.hasNext()) {
            long num = in.nextLong();
            min = Math.min(min, num);
            max = Math.max(max, num);
            total += num;
        }
        System.out.println(""+ (total - max) + " " + (total - min));
    }
}