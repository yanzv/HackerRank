/*
Misery of Jar Jar Binks
Jar Jar Binks is the most clumsy character you will come across in Star Wars. He frequently gets into trouble because of this. 
Recently he went to a shoe store to buy a new pair of shoes. 
Unfortunately, as he entered the store, he tripped and fell on a rack of shoes.
The owner of the store is not happy to find Jar Jar binks at the bottom of a big heap of shoes, espcially since he had set fire to 
his shop last time he came around. The heap of shoes needs to be arranged into pairs.
Given a description of several shoes, you have to help Jar Jar Binks find the maximum number of pairs of shoes that can be formed.
Two shoes can form a pair only if their description is identical, except for the Type. The type of one shoe should be L (Left) 
and other should be R (Right).

Input Format

The first line contains N, the number of shoes.

Each of the next N lines contain description of a shoe in the form:

Companyi Sizei Colori Typei
Constraints:

1<=N<=1000
1<=|Companyi|<=20
1<=|Colori|<=20
0<=Sizei<=15
Companyi is a string of characters a-z
Colori is a string of characters a-z
Typei is either L, or R, indicating Left shoe and Right shoe respectively.
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiseryofJarJarBinks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        */
        ArrayList<String> shoeList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int numShoes = Integer.parseInt(sc.nextLine());
        int numOfPairs = 0;
        for(int i = 0;i < numShoes;i++){
            String shoe = sc.nextLine();
            String shoeDesc = shoe.substring(0,shoe.length()-2);
            String shoeType = shoe.substring(shoe.length()-1,shoe.length()-0);
            System.out.println(shoeDesc + ":"+shoeType);
            if(shoeType.equals("L")){
                int indexRightShoe = shoeList.indexOf(shoeDesc+" R");
                if(indexRightShoe != -1)
                {
                    numOfPairs++;
                    shoeList.remove(indexRightShoe);
                }else{
                    shoeList.add(shoe);
                }
            }else if(shoeType.equals("R")){
                int indexRightShoe = shoeList.indexOf(shoeDesc+" L");
                if(indexRightShoe != -1)
                {
                    numOfPairs++;
                    shoeList.remove(indexRightShoe);
                }else{
                    shoeList.add(shoe);
                }
            }

        }
    }
}








