/* Java End-Of-File

In computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating system where no more data can be read from a data source. (Wikipedia)
Sometimes you don't know how many lines are there in a file and you need to read the file until EOF or End-of-file. In this problem you need to read a file until EOF and print the contents of the file. You must take input from stdin(System.in).

Hints: One way to do this is to use hasNext() function in java scanner class.

Input Format

Each line will contain a non-empty string. Read until EOF.

Output Format

For each line, print the line number followed by a single space and the line content.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int lineNumber = 0;
        while(sc.hasNext()){
            lineNumber++;
            System.out.println(""+lineNumber+" "+sc.nextLine());
        }
    }
}