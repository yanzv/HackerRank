
/* Paint the Classroom

Emma is wallpapering her classroom. She put up  wallpaper panels indexed from  to  and each panel  has a color, , where .

Emma wants to paint the white wallpaper panels either blue or red in such a way that no two adjacent wallpaper panels are 
painted the same color. Two wallpapers with indices  and  are adjacent if .

Given the initial sequence of colors for the wallpaper panels, help Emma determine if it's possible to paint 
the white wallpaper panels in such a way that no two adjacent panels are 
painted the same color. If such a configuration exists, print yes on a new line; otherwise, print no.

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class PaintTheClassRoom {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String c[] = new String[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.next();
        }
        boolean isPossible = true;
        if(c.length == 1){
            System.out.println("yes");
        }else {
            if(c[0].equals("white")) {
                c[0] = c[1].equals("red")?"blue":"red";
            }
            
            for(int i = 1; i < c.length-1; i++){
                String color = c[i];
               
                if (color.equals("white")){
                    c[i] = c[i-1].equals("red")?"blue":"red";
                    if(c[i].equals(c[i+1])){
                        isPossible = false;
                        break;
                    }
                }
            }
            System.out.println(isPossible?"yes":"no");
        }
        
    }         
}