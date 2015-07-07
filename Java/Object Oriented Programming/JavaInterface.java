/* Java Interface 
A Java interface can only contain method signatures and fields. Interface can be used to achieve polymorphism. In this problem you will practice your knowledge on interfaces.

You are given an interface AdvancedArithmetic which contains a method signature public abstract int divisorSum(int n). You need to write a class called MyCalculator which implements the interface.

divisorSum function just takes an integer as input and return the sum of all its divisors. For example divisors of 6 are 1,2,3 and 6, so divisorSum should return 12. Value of n will be at most 1000.

Read the partially completed code in the editor and complete it. You just need to write the MyCalculator class only. Your class shouldn't be public.
*/

class JavaInterface implements AdvancedArithmetic
{
    public int divisorSum(int n)
    {
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
               
            }
        }
        return sum;      
    }
}