
/* Large Matrix

Sam has a matrix of infinite dimensions. He starts out by placing a black ball in the top-left cell of the matrix and 
then fills the rest of the cells by placing the remaining balls in such a way that no two adjacent cells 
contain balls of the same color.

Two cells are considered to be adjacent if they share a common side (i.e., cell  is adjacent to cells and .

You're given  queries in the form of two integers denoting the location of a cell at row  and column . 
For each query, print the color of the ball Sam placed in that cell (i.e., either red or black) on a new line.


*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class LargeMatrix {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            int r = in.nextInt();
            int c = in.nextInt();
            if(r % 2 == 0){
                if(c % 2 == 0){
                    System.out.println("black");
                } else {
                    System.out.println("red");
                }
            } else if(c % 2 == 0){
                    System.out.println("red");
                } else {
                    System.out.println("black");
                }
        }
    }          
}