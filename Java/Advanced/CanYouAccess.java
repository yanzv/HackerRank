/* Can You Access?

You are given a class Solution and an inner class Inner.Private. The main method of class Solution 
takes an integer num as input. The powerof2 in class Inner.Private checks whether a number is a power of 2. 
You have to call the method powerof2 of the class Inner.Private from the main method of the class Solution.

Constraints 
1≤num≤230

Sample Input

8

Sample Output

8 is power of 2
An instance of class: Solution.Inner.Private has been created
*/

o = new Inner().new Private();
System.out.println(""+num+" is "+((Inner.Private)o).powerof2(num));