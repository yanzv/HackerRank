/* Lonely Integer
There are N integers in an array A. All but one integer occur in pairs. Your task is to find the number that occurs only once.

Input Format

The first line of the input contains an integer N, indicating the number of integers. The next line contains N space-separated integers that form the array A.

Constraints

1≤N<100 
N % 2=1 (N is an odd number) 
0≤A[i]≤100,∀i∈[1,N]
Output Format

Output S, the number that occurs only once.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        ArrayList<String> alStr = new ArrayList<String>(Arrays.asList(sc.nextLine().split(" ")));
        String answer="";
        int pos = 0;
        while(alStr.size()>1){     
            answer = alStr.get(0);
            alStr.remove(0);
            if(!alStr.contains(answer)){
                break;
            }else{
                alStr.remove(answer);
            }
            pos++;
            
        }
        System.out.println(alStr.size()!=1?answer:alStr.get(0));
    }
}