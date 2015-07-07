/* Solve Me First

This is an introductory challenge. The purpose of this challenge is to give you a working I/O template in your preferred language. It includes scanning two integers from STDIN, calling a function, returning a value, and printing it to STDOUT.

The task is to scan two numbers from STDIN, and print the sum A+B on STDOUT. The code has already been provided for most of the popular languages. This is primarily for you to read and inspect how the IO is handled.

Note: The code has been saved in a template, which you can submit if you want. Or, you may try rewriting it and building it up from scratch.

Input Format 
(This section specifies the Input Format.) 
Given A and B on two different lines.

Output Format 
(This section specifies the Output Format.) 
An integer that denotes Sum (A+B)
Constraints 
(This section tells what input you can expect. You can freely assume that the input will remain within the boundaries specified. As an example here given below, A and B will never be below 1 or above 1000.) 
1≤A,B≤1000
Sample Input

2
3
Sample Output

5
The above sample should be taken seriously. The input will be 2 and 3 in two separate lines, and the output should be just one number, 5. You should not print any whitespace at the beginning of output (e.g. " 5" or "\n5"), unless specifically asked for. Also, printing any extra non-whitespace characters such as "The answer is: 5" will result in a Wrong Answer, as the judging is done using diff checker.
*/

#import <Foundation/Foundation.h>
int solveMeFirst(int a, int b) { 
    return a+b;
}
 
int main (int argc, const char * argv[]) {
    NSAutoreleasePool *pool = [[NSAutoreleasePool alloc] init];
    int a,b,res;
    scanf("%d %d", &a, &b);
    res = solveMeFirst(a,b);
    printf("%d", res);
    [pool drain];
    return 0;
}