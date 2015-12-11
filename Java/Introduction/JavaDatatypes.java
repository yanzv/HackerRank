/* Java Datatypes

Java has 8 Primitive Data Types; they are char, boolean, byte, short, int, long, float, and double. In this problem we are only concerned about integer datatypes used to hold integer values (byte, short, int, long). Let's take a closer look at them:

byte data type is an 8-bit signed integer.
short data type is an 16-bit signed integer.
int data type is an 32-bit signed integer.
long data type is an 64-bit signed integer.
(Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)

Given an integer number, you have to determine which of these datatypes you can use to store that number. 
If there are multiple suitable datatypes, list them all in the order above.

Input Format

The first line will contain an integer T, which denotes the number of inputs that will follow. 
Each of the next T lines will contain an integer n. The number can be arbitrarily large or small!

Output Format

For each n, list all the datatypes it can be fitted into ordered by the size of the datatype. 
If it can't be fitted into any of these datatypes, print "n can't be fitted anywhere." See the sample output for the exact 
formatting.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaDatatypes {

    static String whoCanFitTheNumber(String numString)
    {
        String answer = "";
        try{
            long num = Long.parseLong(numString);
            answer = numString + " can be fitted in:\n";
            if((num<=Byte.MAX_VALUE) && (num>=Byte.MIN_VALUE)){
                answer = answer.concat("* byte\n* short\n* int\n* long");
            }else if((num <= Short.MAX_VALUE) && (num >= Short.MIN_VALUE)){
                answer = answer.concat("* short\n* int\n* long");
            }else if((num <= Integer.MAX_VALUE) && (num >= Integer.MIN_VALUE)){
                    answer = answer.concat("* int\n* long");
            }else{
                    answer = answer.concat("* long");
            }
        }catch (NumberFormatException e){
            answer = numString+" can't be fitted anywhere.";
        }
        return answer;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        */
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt() ;
        scanner.nextLine();
        for(int i=0; i<numTestCases;i++){
            String numString = scanner.nextLine();
            System.out.println(whoCanFitTheNumber(numString));
        }
    }
}