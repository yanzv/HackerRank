/* JavaLambdaExpressions

This Java 8 challenge tests your knowledge of Lambda expressions!

Write the following methods that return a lambda expression performing a specified action:

performOperation checkEvenOdd(): The lambda expression must return  if a number is even or  if it is odd.
performOperation checkPrime(): The lambda expression must return  if a number is prime or  if it is composite.
performOperation checkPalindrome(): The lambda expression must return  if a number is a palindrome or  if it is not.
Input Format

Input is handled for you by the locked stub code in your editor.

Output Format

The locked stub code in your editor will print  lines of output.

Sample Input

The first line contains an integer,  (the number of test cases).

The  subsequent lines each describe a test case in the form of  space-separated integers: 
The first integer specifies the condition to check for ( for Odd/Even,  for Prime, or  for Palindrome). 
The second integer denotes the number to be checked.

5
1 4
2 5
3 898
1 3
2 12
Sample Output

EVEN
PRIME
PALINDROME
ODD
COMPOSITE
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


    interface performOperation
    {
    	int check(int a);
	}
	class Math{
   		public static int checker(performOperation p ,int num){
       		return p.check(num);
   		}
   		
   		performOperation checkEvenOdd()
    	{
        	performOperation p =  (a) -> {return a%2;};
        
        	return p;
    	}

	    performOperation checkPrime ()
	    {
	        performOperation p =  (a) -> { 
	                                        if (a == 1) return 1;
	                                        for(int i = 2;i<a/2+1;i++){
	                                            if((a%i)==0) return 1; 
	                                        }
	                                        return 0;
	                                     };
	        return p;
	    }
    
	    performOperation checkPalindrome()
	    {
	        performOperation p =  (a) -> {
	                                        String word = ""+a;
	                                        boolean isPalindrome = true;
	                                        for(int i = 0;i<(int)word.length()/2;i++)
	                                        {
	                                            if(word.charAt(i) != word.charAt(word.length()-1-i)){
	                                                isPalindrome = false;
	                                                break;

	                                            }
	                                        }
	                                        return isPalindrome?0:1;
	                                     };
	        return p;
	    }	
	}   
	
public class JavaLambdaExpressions {

    public static void main(String[] args)throws IOException {
        Math ob = new Math();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        performOperation op;
        int ret =0;
        String ans=null;
        while(T-->0){
            String s=br.readLine().trim();
            StringTokenizer st=new StringTokenizer(s);
            int ch=Integer.parseInt(st.nextToken());
            int num=Integer.parseInt(st.nextToken());
            if(ch==1){
                op = ob.checkEvenOdd();  
                ret = ob.checker(op,num);
                ans = (ret == 0)?"EVEN":"ODD";
            }
            else if(ch==2){
                op = ob.checkPrime();
                ret = ob.checker(op,num);
                ans = (ret == 0)?"PRIME":"COMPOSITE";
            }
            else if(ch==3){
                op = ob.checkPalindrome();
                ret = ob.checker(op,num);
              	ans = (ret == 0)?"PALINDROME":"NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }          
}