/* Cavity Map
You are given a square map of size n×n. Each cell of the map has a value denoting its depth. We will call a cell of the map a cavity if and only if this cell is not on the border of the map and each cell adjacent to it has strictly smaller depth. Two cells are adjacent if they have a common side (edge).

You need to find all the cavities on the map and depict them with the uppercase character X.

Input Format

The first line contains an integer, n, denoting the size of the map. Each of the following n lines contains n positive digits without spaces. Each digit (1-9) denotes the depth of the appropriate area.

Constraints 
1≤n≤100
Output Format

Output n lines, denoting the resulting map. Each cavity should be replaced with character X.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CavityMap {

    public static void printMapWithCavities(char[][]map, int mapSize)
    {
        
        for(int row = 1;row < mapSize-1;row++){
            for(int column = 1; column < mapSize-1;column++){
                int cellDepth = map[row][column];
                if(cellDepth>map[row][column+1] && cellDepth>map[row][column-1] && cellDepth>map[row-1][column] &&                         cellDepth>map[row+1][column]){
                    map[row][column] = 'X';
                }
            }
        }
        for(int row = 0;row<mapSize;row++){
            System.out.println(String.valueOf(map[row]));                
        }

    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int mapSize = Integer.parseInt(sc.nextLine());
        char [][]map = new char[mapSize][];
        for(int i = 0;i<mapSize;i++){
            String numbersString = sc.nextLine();
            map[i] = numbersString.toCharArray();
        }
        printMapWithCavities(map,mapSize);
    }
}