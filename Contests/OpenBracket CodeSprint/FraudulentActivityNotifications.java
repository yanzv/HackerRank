/*

Fraudulent Activity Notifications

OpenBracket CodeSprint

https://www.hackerrank.com/contests/openbracket/challenges/fraudulent-activity-notifications

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FraudulentActivityNotifications {

    static double calculateMedian(ArrayList<Integer> spendingsArrayList)
    {
        
       if(spendingsArrayList.size() % 2 == 0){
            int middle = ((int) spendingsArrayList.size() / 2) - 1; //offset start 0
            double median = (spendingsArrayList.get(middle) + spendingsArrayList.get(middle+1)) / 2.0;
            return median;
        }
        return spendingsArrayList.get((int) Math.ceil(spendingsArrayList.size() / 2));
    }

    public static void binaryInsertIntegerSortedIntoArrayList(ArrayList<Integer> spendingsArrayList, Integer num)
   {
        if (spendingsArrayList.size() == 0) {
            spendingsArrayList.add(num);
            return;
        }
        int lowerBound = 0;
        int upperBound = spendingsArrayList.size();
        int position = ( lowerBound + upperBound) / 2;
        while(position < spendingsArrayList.size() && (spendingsArrayList.get(position) != num) && (lowerBound <= upperBound))
        {
            if (spendingsArrayList.get(position) > num)             
            {                                              
              upperBound = position - 1;   
            }                                                             
            else                                                   
            {                                                        
              lowerBound = position + 1;    
            }
            position = (lowerBound + upperBound) / 2;

        }

        if(position >= spendingsArrayList.size()){
            spendingsArrayList.add(num);
        }else if(spendingsArrayList.get(position) == num){
            spendingsArrayList.add(position, num);
        } else if(num > spendingsArrayList.get(position)){
                spendingsArrayList.add(upperBound+1, num);
        } else {
            spendingsArrayList.add(lowerBound, num);
        }
   }
               
               
    
    static void removeFromSpendingsArrayList(ArrayList<Integer> spendingsArrayList, Integer num)
    {
        if (spendingsArrayList.size() == 0) return;
        //Using binary search to remove any integer object with the same value as num
        //Doesn't have to be the same object
        
        int lowerBound = 0;
        int upperBound = spendingsArrayList.size();
        int position = ( lowerBound + upperBound) / 2;
        while(spendingsArrayList.get(position).intValue() != num.intValue())
        {
            if (spendingsArrayList.get(position).intValue() > num.intValue())             
            {                                              
              upperBound = position - 1;   
            }                                                             
            else                                                   
            {                                                        
              lowerBound = position + 1;    
            }
            position = (lowerBound + upperBound) / 2;

        }
        //value should be found
        spendingsArrayList.remove(position);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double numDays = sc.nextInt();
        double numDaysToCalculateSpendings = sc.nextInt();
        ArrayList<Integer> spendingsArrayList = new ArrayList<>();
        ArrayList<Integer> expenditures = new ArrayList<>();
        int numNotifications = 0;
        int pos = 0;
        double median = 0;
        for(double i = 0; i < numDays;i++){
            Integer expenditure = new Integer(sc.nextInt());
            expenditures.add(expenditure);
            if(i >= numDaysToCalculateSpendings){
                median = calculateMedian(spendingsArrayList);
                if(expenditure.intValue() >= (median * 2)){
                    numNotifications++;
                }
                removeFromSpendingsArrayList(spendingsArrayList, expenditures.get(pos++));
            }
            binaryInsertIntegerSortedIntoArrayList(spendingsArrayList,expenditure);
        }
        sc.close();
        System.out.println(numNotifications);
    }
}