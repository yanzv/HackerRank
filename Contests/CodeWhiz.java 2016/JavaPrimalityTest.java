/* Java List

Java's BitSet class implements a vector of bit values (i.e.:  () or  ()) that grows as needed, 
allowing us to easily manipulate bits while optimizing space (when compared to other collections). 
Any element having a bit value of  is called a set bit.

Given  BitSets,  and , of size  where all bits in both BitSets are initialized to, 
perform a series of  operations. After each operation, print the number of set bits 
in the respective BitSets as two space-separated integers on a new line.

Input Format

The first line contains  space-separated integers,  (the length of both BitSets  and ) 
and  (the number of operations to perform), respectively. 
The  subsequent lines each contain an operation in one of the following forms:

AND 
OR 
XOR 
FLIP
SET 
In the list above,  is the integer  or , where  denotes  and  denotes. 
 is an integer denoting a bit's index in the BitSet corresponding to.

For the binary operations , , and , operands are read from left to right and the BitSet resulting 
from the operation replaces the contents of the first operand. For example:

AND 2 1
 is the left operand, and  is the right operand. This operation should assign the result of  to .

Constraints

Output Format

After each operation, print the respective number of set bits in BitSet  and BitSet 
as space-separated integers on a new line.

Sample Input

5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1
Sample Output

0 0
1 0
1 1
1 2
 
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaPrimalityTest
{

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int bitSetSize = sc.nextInt();
        int numOperations = sc.nextInt();
        BitSet[] bitSetArray = new BitSet[2];
        bitSetArray[0] = new BitSet(bitSetSize);
        bitSetArray[1] = new BitSet(bitSetSize);
        sc.nextLine();
        for(int i = 0;i < numOperations; i++)
        {
            String[] opArray = sc.nextLine().split(" ");
            switch(opArray[0]){
                case "AND": bitSetArray[Integer.parseInt(opArray[1])-1].and(bitSetArray[Integer.parseInt(opArray[2])-1]);
                break;
                case "OR": bitSetArray[Integer.parseInt(opArray[1])-1].or(bitSetArray[Integer.parseInt(opArray[2])-1]);
                break;
                case "XOR": bitSetArray[Integer.parseInt(opArray[1])-1].xor(bitSetArray[Integer.parseInt(opArray[2])-1]);
                break;
                case "FLIP": bitSetArray[Integer.parseInt(opArray[1])-1].flip(Integer.parseInt(opArray[2]));
                            break;
                case "SET": bitSetArray[Integer.parseInt(opArray[1])-1].set(Integer.parseInt(opArray[2]));
                            break;
            }
            System.out.println(bitSetArray[0].cardinality() + " " + bitSetArray[1].cardinality());
            
        }
    }
}