/* Compare the Triplets

Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, 
awarding points on a scale from  to  for three categories: problem clarity, originality, and difficulty.

We define the rating for Alice's challenge to be the triplet , and the rating for 
Bob's challenge to be the triplet.

Your task is to find their comparison scores by comparing  with ,  with , and  with.

If , then Alice is awarded  point.
If , then Bob is awarded  point.
If , then neither person receives a point.
Given  and , can you compare the two challenges and print their respective comparison points?

Input Format

The first line contains  space-separated integers, , , and , describing the respective values in triplet . 
The second line contains  space-separated integers, , , and , describing the respective values in triplet .

Constraints



Output Format

Print two space-separated integers denoting the respective comparison scores earned by Alice and Bob.

Sample Input

5 6 7
3 6 10
Sample Output

1 1 
*/

#import <Foundation/Foundation.h>


int main(int argc, const char * argv[]){
    NSAutoreleasePool *pool = [[NSAutoreleasePool alloc] init];
    NSInteger a0;
    NSInteger a1;
    NSInteger a2;
    scanf("%li %li %li",&a0,&a1,&a2);
    NSInteger b0;
    NSInteger b1;
    NSInteger b2;
    scanf("%li %li %li",&b0,&b1,&b2);
    NSInteger aliceTotal = 0;
    NSInteger bobTotal = 0;
    a0 > b0?aliceTotal++:a0 < b0?bobTotal++:0;
    a1 > b1?aliceTotal++:a1 < b1?bobTotal++:0;
    a2 > b2?aliceTotal++:a2 < b2?bobTotal++:0;
    printf("%li %li",aliceTotal, bobTotal);
    
    [pool drain];
    return 0;
}