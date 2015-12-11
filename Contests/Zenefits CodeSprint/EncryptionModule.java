/*
Encryption Module

"There is an encryption module aboard this Separatist dreadnaught. This device is scrambling all Separatist communication in the region."

―Mace Windu



An encryption module was an encryption device used to encode messages sent over comlink or through subspace.
For this problem, we will consider a very simplistic version of Encryption module. The encryption module works as following:

P = plaintext to be encrypted, which consists of characters a−z (no spaces or punctuation marks). This is the input to the encryption module.

E = P encrypted by Caesar cipher. The shift width is not known to us.

E′ = 'scrambled' E. That is, some letters of E have been changed arbitrarily. E′ still consists of letters a−z only, and its length is same as E. 
This is the output of the encryption module.

R2-D2 is trying to analyze the encryption module. It knows the value of P and E′, help R2-D2 find the value of E so that the number of 
mismatched characters between E and E′ is minimal. You have to just return the minimum possible number of mismatches.

Note: Number of mismatches between two string E and E′ of the same length is defined as the number of positions i for which E[i]≠E′[i].

Input Format

The first line contains T, the number of test cases. T test cases follow. Each test case consists of a single line containing two space 
separated strings, P and E′.

Constraints:

1≤T≤100
1≤|P|=|E′|≤100
Both P and E′ consist of small case characters 
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.*;

public class EncryptionModule{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String P = in.next();
            String E = in.next();
            int charSum = 0;
            Integer shift = null;
            HashMap<Integer,Integer>shiftList = new HashMap<Integer,Integer>();
            for(int i = 0;i < P.length();i++){
                if(E.charAt(i)>P.charAt(i)){
                    shift = new Integer(('z'- E.charAt(i))+(P.charAt(i)-'a')+1);
                }else{                  
                    shift = new Integer(P.charAt(i) - E.charAt(i));
                }
                
                Integer countShifts = shiftList.get(shift); 
                if(countShifts == null){
                    
                    shiftList.put(shift,new Integer(1));
                }else{
                    shiftList.put(shift,++countShifts);
                }
            }
            int mostShifts = 0;
            for(Map.Entry<Integer, Integer> shiftEntry : shiftList.entrySet()) {
                Integer key = shiftEntry.getKey();
                Integer value = shiftEntry.getValue();
               
                if(mostShifts == 0){
                     
                    mostShifts = value;
                }
                if(mostShifts<value){
                    mostShifts = value;
                   
                }
            }
            System.out.println(""+(P.length()-mostShifts));
        }
    }
}








