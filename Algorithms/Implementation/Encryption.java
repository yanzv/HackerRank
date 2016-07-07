import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Encryption {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int rows = (int) Math.floor(Math.sqrt(s.length()));
        int columns = (int) Math.ceil(Math.sqrt(s.length()));
        if(rows*columns < s.length())rows ++;
        String[][] encryptArray = new String[rows][columns];

        int r = 0;
        int c = 0;
        for(int i = 0; i < s.length();i++){
        	encryptArray[r][c] = ""+s.charAt(i);
        	if(c == columns - 1){ 
                c = -1;
                r++;
            }
            c++;
        }

        String encryptedString = "";
        for(int k = 0;k < columns;k++){
        	for(int i = 0;i < rows;i++){
        		encryptedString = encryptedString + (encryptArray[i][k] != null?encryptArray[i][k]:"");
        	}
        	encryptedString +=" ";
        }

        System.out.println(encryptedString);
    }	
}

