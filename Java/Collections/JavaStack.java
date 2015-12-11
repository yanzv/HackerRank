/* Java Stack

Problem Statement

In computer science, a stack or LIFO (last in, first out) is an abstract data type that serves as a 
collection of elements, with two principal operations: push, which adds an element to the collection, and 
pop, which removes the last element that was added.(Wikipedia)
A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. 
if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})" 

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.

Input Format

There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.

The part of the code that handles input operation is already provided in the editor.

Output Format

For each case, print 'true' if the string is balanced, 'false' otherwise.

Sample Input

{}()
({()})
{}(
[]

Sample Output

true
true
false
true
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;

public class JavaStack {

    static boolean isBallanced(String paranString)
    {
        List<String>closingParan =  Arrays.asList("}", ")", "]");
        boolean isBallanced = true;
        ArrayList<String> stack = new ArrayList<String>();
        if(paranString.length()>0){
            for(int i = 0;i<paranString.length();i++){
                String paran = paranString.substring(i,i+1); 
                if(stack.size() == 0 && closingParan.contains(paran)){
                    isBallanced=false;
                    break;
                }else{
                    if(paran.equals("{") || paran.equals("(") || paran.equals("[")){
                        stack.add(paran);
                    }else{
                        String stackParan = stack.get(stack.size()-1);
                        if((stackParan.equals("{") && paran.equals("}")) || (stackParan.equals("(") && paran.equals(")") || (stackParan.equals("[") && paran.equals("]")))) {
                            stack.remove(stack.size()-1);
                        }else{
                            isBallanced = false;
                            break;
                        }
                    }
                }
            }  
        }
        if(stack.size()>0) isBallanced = false;
        return isBallanced;    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            if(isBallanced(sc.nextLine())){
                System.out.println("true");
            }else{
                System.out.println("false");
            }       
        }
        
    }
}