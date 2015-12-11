/* Java Varargs - Simple Addition

You are given a class Solution and its main method in the editor. 
Your task is to create the class Add and the required methods so that the code prints the sum of the numbers 
passed to the function add.

Note: Your add method in the Add class must print the sum as given in the Sample Output

Input Format

There are six lines of input, each containing an integer.

Output Format

There will be only four lines of output. Each line contains the sum of the integers passed as the parameters 
to add in the main method.

Sample Input

1
2
3
4
5
6
Sample Output

1+2=3
1+2+3=6
1+2+3+4+5=15
1+2+3+4+5+6=21

*/

class Add
{
    static void add(int...numbers)
    {
        int sum = 0;
        for(int num:numbers)
        {
            if(sum !=0){
                System.out.print("+");
            }
            sum+=num;
            System.out.print(num);
        }
        System.out.println("="+sum);
    }
}