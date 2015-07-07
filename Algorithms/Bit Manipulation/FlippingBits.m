/* Flipping Bits

You will be given a list of 32 bits unsigned integers. You are required to output the list of the unsigned integers you get by flipping bits in its binary representation (i.e. unset bits must be set, and set bits must be unset).

Input Format

The first line of the input contains the list size T, which is followed by T lines, each line having an integer from the list.

Constraints

1≤T≤100 
0≤integer<2^32
Output Format

Output one line per element from the list with the requested result.
*/

#import <Foundation/Foundation.h>

    
int main (int argc, const char * argv[]) {
    NSAutoreleasePool *pool = [[NSAutoreleasePool alloc] init];
    int numInput;
    scanf("%d", &numInput);
    for(int i=0;i<numInput;i++){
        unsigned int num;
        scanf("%u",&num);
        printf("%u\n",(num^0xFFFFFFFF));
    }

    [pool drain];
    return 0;
}