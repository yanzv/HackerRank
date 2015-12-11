/* Angry Professor

A Discrete Mathematics professor has a class of N students. Frustrated with their lack of discipline, 
he decides to cancel class if fewer than K students are present when class starts.

Given the arrival time of each student, determine if the class is canceled.

Input Format

The first line of input contains T, the number of test cases.

Each test case consists of two lines. The first line has two space-separated integers, N (students in the class) 
and K (the cancelation threshold). 
The second line contains N space-separated integers (a1,a2,…,aN) describing the arrival times for each student.

Note: Non-positive arrival times (ai≤0) indicate the student arrived early or on time; positive arrival times (ai>0) 
indicate the student arrived ai minutes late.

Output Format

For each test case, print the word YES if the class is canceled or NO if it is not.

Constraints

1≤T≤10
1≤N≤1000
1≤K≤N
−100≤ai≤100,where i∈[1,N]
Note 
If a student arrives exactly on time (ai=0), the student is considered to have entered before the class started.

Sample Input

2
4 3
-1 -3 4 2
4 2
0 -1 2 1

Sample Output

YES
NO
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProfessor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numCases=Integer.parseInt(sc.nextLine());
        for(int i = 0;i<numCases;i++){
            int numStudents = sc.nextInt();
            int atLeastNumStudents = sc.nextInt();
            sc.nextLine();
            boolean isClass = true;
            int studentsAttending = 0;
            for(int j = 0;j<numStudents;j++){
                int timeArrival = sc.nextInt();
                if(timeArrival<=0){
                    studentsAttending++;
                }
            }
            System.out.println(studentsAttending>=atLeastNumStudents?"NO":"YES");
        }
    }
}