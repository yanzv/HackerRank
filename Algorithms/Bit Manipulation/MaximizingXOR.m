/* Maximizing XOR
Given two integers, L and R, find the maximal value of A xor B, where A and B satisfy the following condition:

L≤A≤B≤R
Input Format

The input contains two lines; L is present in the first line and R in the second line.

Constraints 
1≤L≤R≤10^3

Output Format

The maximal value as mentioned in the problem statement.
*/

//Enter your code here. Read input from STDIN. Print output to STDOUT
#import <Foundation/Foundation.h>

int calculateMaximizingOR(int L,int R)
{
   int maxVal = 0;
   for(int i=L;i<=R;i++){
        for(int j=i;j<=R;j++){
            if((i^j)>maxVal){
                maxVal=i^j;
            } 
        }
   }           
   return maxVal;      
}
    
int main (int argc, const char * argv[]) {
    NSAutoreleasePool *pool = [[NSAutoreleasePool alloc] init];
    int L,R;
    scanf("%d %d", &L,&R);
    printf("%d\n",calculateMaximizingOR(L,R));

    [pool drain];
    return 0;
}