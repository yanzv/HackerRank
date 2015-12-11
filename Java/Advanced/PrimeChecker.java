/* Prime Checker

You are given a class Solution and its main method in the editor. Your task is to create a 
class Prime which contains a single method checkPrime so that the code prints only prime numbers as the output.

Please do not use method overloading!

Note: You may get a compile time error in this problem due to the below statement:

  BufferedReader br=new BufferedReader(new InputStreamReader(in));
This was added intentionally, and you have to figure out a way to get rid of the error.

Input Format

There are only five lines of input, each containing one integer.

Output Format

There will be only four lines of output. Each line contains only prime numbers depending 
upon the parameters passed to checkPrime in the main method of the class Solution. In case there is 
no prime number, then a blank line should be printed.

Sample Input

  2
  1
  3
  4
  5

Sample Output

2 
2 
2 3 
2 3 5 

*/

import static java.lang.System.in;
class Prime
{
    public boolean isPrime(int num)
    {
        if (num == 1) return false;
        for(int i = 2;i<num/2+1;i++){
            if((num%i)==0) return false; 
        }
       
        return true;
    }
    public void checkPrime(int... numbers)
    {
        
        for(int num:numbers){
            System.out.print(isPrime(num)?""+num+" ":"");
        }
        System.out.println("");
    }
}