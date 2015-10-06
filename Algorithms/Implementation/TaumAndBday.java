/* Taum and B'day
Taum is planning to celebrate the birthday of his friend, Diksha. There are two types of gifts that Diksha wants from Taum: one is black and the other is white. To make her happy, Taum has to buy B number of black gifts and W number of white gifts.

The cost of each black gift is X units.
The cost of every white gift is Y units.
The cost of converting each black gift into white gift or vice versa is Z units.
Help Taum by deducing the minimum amount he needs to spend on Diksha's gifts.

Input Format

The first line will contain an integer T which will be the number of test cases.
There will be T pairs of lines. The first line of each test case will contain the values of integers B and W. Another line of each test case will contain the values of integers X, Y, and Z.

Constraints 
1≤T≤10 
0≤X,Y,Z,B,W≤10^9
*/
import java.io.*;
import java.util.*;

public class TaumAndBday {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
      
        for(int i = 0;i<numCases;i++){
			// have to use long because of the contraints which will not fit in int
            long numBlackGifts = sc.nextLong(); 
            long  numWhiteGifts = sc.nextLong();
            long  costBlackGift = sc.nextLong();
            long  costWhiteGift = sc.nextLong();
            long  conversionCost = sc.nextLong();
            long price = 0;
            if((costWhiteGift+conversionCost)<costBlackGift){
                price = (costWhiteGift+conversionCost)*numBlackGifts + (numWhiteGifts*costWhiteGift);
            }else if ((costBlackGift+conversionCost) < costWhiteGift){
                price = ((costBlackGift + conversionCost) * numWhiteGifts) + (numBlackGifts*costBlackGift);
            }else{
                price = (costBlackGift * numBlackGifts) + (costWhiteGift * numWhiteGifts);
            }
            System.out.println(price);
        }
    }
}