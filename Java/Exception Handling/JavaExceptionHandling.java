/* Java Exception Handling
Create a class myCalculator which consists of a single method power(int,int). This method takes two integers, 
n and p, as parameters and finds np. If either n or p is negative, then the method must throw an exception 
which says "n and p should be non-negative".

Please read the partially completed code in the editor and complete it. Your code mustn't be public.

No need to worry about constraints, there won't be any overflow if your code is correct.

*/

class JavaExceptionHandling
{
    public int power(int n, int p) throws Exception
    {
        if(n<0 || p<0){
            throw new Exception("n and p should be non-negative");
        }
        return (int) Math.pow(n,p);
        
    }
    
}