/* Perfect Hiring 

You are the hiring manager of a startup and you are interviewing N candidates, each having an ID numbered from 1 to N. Each candidate has a score Ai calculated from their HackerRank tests. You start with patience P and lose patience X after each interview.

One by one candidates enter your room in the sequence of their ID numbers. To save time you decide to give a rating of (P×Ai). In the end you hire the candidate with maximum rating. Print the ID of this candidate. 
NOTE: It is guaranteed that a unique ID gets selected.

Input Format 
The first line begins with 3 space-separated integers, N, P, and X. 
The next line contains an array A[], containing the scores of the N candidates.

Constraints 
1≤N≤10^5 
1≤P≤10^9 
1≤X≤100 
1≤Ai≤10^9

Output Format 
Output the ID of the Applicant who get selected.

NOTE: ID's are numbered from 1 to N.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PerfectHiring {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        String[] firstLineArray = sc.nextLine().split(" ");
        BigInteger  numOfApplicants = new BigInteger(firstLineArray[0]);
        BigInteger patienceLeft = new BigInteger(firstLineArray[1]);
        BigInteger  loosePatience =new BigInteger(firstLineArray[2]);
        BigInteger selectedCandidate= new BigInteger("0");
        BigInteger  maxRating = new BigInteger("0");
        BigInteger pos = new BigInteger("1");
        while(sc.hasNext()){
            BigInteger score = sc.nextBigInteger().multiply(patienceLeft);
            if(maxRating.compareTo(score)<0){
                maxRating = score;
                selectedCandidate = pos;
            }
            patienceLeft = patienceLeft.subtract(loosePatience);
            pos = pos.add(BigInteger.ONE);
        }
        System.out.println(selectedCandidate);
    }
}