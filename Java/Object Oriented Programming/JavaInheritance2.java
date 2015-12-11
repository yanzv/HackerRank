/* Java Inheritance
Take a look at the following java code:

class Solution{

    public static void main(String []argh){
        Adder X=new Adder();
        System.out.println("My superclass is: "+X.getClass().getSuperclass().getName());    
        System.out.print(X.add(10,32)+" "+X.add(10,3)+" "+X.add(10,10)+"\n");

    }
}
The main function in Solution class creates an object of Adder class. Then it prints the name of the class that Adder inherited and calls the add method several times.

Now complete this code so that it outputs the following lines:

My superclass is: Arithmetic
42 13 20
You don't need to write the Solution class. We will append your code with the code given above before running it.

If you need to write more than one class, write them in a single file. Your classes shouldn't be public.

Sample Input

No input.

Sample Output

My superclass is: Arithmetic
42 13 20
*/

//Write your code here
class Arithmetic{
   public String getName()
   {
       return "Arithmetic";
       
   }
}
class Adder extends Arithmetic
{
    public int add(int a, int b)
    {
        return a+b;
        
    }   
}