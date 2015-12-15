/* The Ultimate Question

42 is the answer to "The Ultimate Question of Life, The Universe, and Everything". But what The 
Ultimate Question really is? We may never know!

Given three integers, a, b, and c, insert two operators between them so that the following equation is true: 
a (operator1) b (operator2) c=42.

You may only use the addition (+) and multiplication (∗) operators. You can't change the order of the variables.

If a valid equation exists, print it; otherwise, print This is not the ultimate question.

Input Format

A single line consisting three space-separated integers: a, b, and c.

Constraints: 
0≤a,b,c≤42
Output Format

Print the equation with no whitespace between the operators and the three numbers. If there is no answer, 
print This is not the ultimate question.

Note: It is guaranteed that there is no more than one valid equation per test case.

Sample Input

Example 1:

12 5 6
Example 2:

10 20 12
Example 3:

5 12 6
Sample Output

Example 1:

12+5*6
Example 2:

10+20+12
Example 3:

This is not the ultimate question
*/

import java.io.*;
import java.util.*;

public class TheUltimateQuestion {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ultNum = 0;
        String equation = null;
        for(int i = 0; i < 4; i++)
        {
            
            if((i&2) == 2){
                if((i&1) == 1){
                    ultNum = a*b*c;
                }else{
                    ultNum = a*b+c; 
                }
            }else{
                if((i&1) == 1){
                    ultNum = a+b*c;
                }else{
                    ultNum = a+b+c;
                }
            }
            if(ultNum == 42){
                 equation = ((i&2)==2?""+a+"*"+b:a+"+"+b) + ((i&1)==1?"*"+c:"+"+c);
                 break;
            }
            ultNum = 0;
        }
        System.out.println(equation != null?equation:"This is not the ultimate question");
    }
}