/* 
Bon Appétit
https://www.hackerrank.com/challenges/bon-appetit
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonAppetit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numItems = sc.nextInt();
        int nthItem = sc.nextInt();
        int totalSum = 0;
        int[] items = new int[numItems];
        
        for(int i = 0;i < numItems;i++){
            items[i] = sc.nextInt();
            totalSum += items[i];
        }
        
        int annasCharge = sc.nextInt();
        if(nthItem == 0){
            if(totalSum == annasCharge){
                System.out.println("Bon Appetit");
            } else {
                System.out.println("" + (annasCharge - totalSum));
            } 
        } else {
            if(annasCharge == (totalSum - items[nthItem]) /2 ){
                System.out.println("Bon Appetit");
            }else{
                System.out.println("" + (annasCharge - (totalSum - items[nthItem])/2)); 
            }
        } 
    }
}