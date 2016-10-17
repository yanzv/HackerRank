/*

Viral Advertising

OpenBracket CodeSprint

https://www.hackerrank.com/contests/openbracket/challenges/strange-advertising/copy-from/7419577

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ViralAdvertising {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDays = sc.nextInt();
        int numReceived = 5;
        int numPeopleLiked = 0;
        for(int i = 0;i < numDays; i++){
            int numPeopleLikedToday = (int) Math.floor(numReceived / 2);
            numPeopleLiked += numPeopleLikedToday;
            numReceived = numPeopleLikedToday * 3;  
        }
        System.out.println(numPeopleLiked);

    }
}