/* Flowers
You and your K-1 friends want to buy N flowers. Flower number i has cost ci. Unfortunately the seller does not want just one customer to buy a lot of flowers, so he tries to change the price of flowers for customers who have already bought some flowers. More precisely, if a customer has already bought x flowers, he should pay (x+1)*ci dollars to buy flower number i.
You and your K-1 friends want to buy all N flowers in such a way that you spend the least amount of money. You can buy the flowers in any order.

Input:

The first line of input contains two integers N and K (K <= N). The next line contains N space separated positive integers c1,c2,...,cN.

Output:

Print the minimum amount of money you (and your friends) have to pay in order to buy all N flowers.
*/


import java.io.*;
import java.util.*;

public class Flowers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> flowerPriceList = new ArrayList<Integer>();
        int numFlowers = sc.nextInt();
        int numFriends = sc.nextInt();
        for(int i = 0; i<numFlowers;i++){
            flowerPriceList.add(sc.nextInt());
        }
		// Sort the ArrayList in reverse order to start bying flowers from most expensive
        Collections.sort(flowerPriceList,Collections.reverseOrder());
        int flowersBought = 0;
        int friendNum = 0;
        int total = 0;
        for(int price:flowerPriceList){
			//itterate throught all the flower prices and calculate the total
            total +=(flowersBought+1)*price;
            friendNum++;
            if(friendNum == numFriends){
				//if all friends bought flowers reset the friend counter and restart the cycle
                friendNum = 0;
                flowersBought++;
            }
        }
        System.out.println(total);
    }
}