/** Time Conversion

You are given time in AM/PM format. Convert this into a 24 hour format.

Note Midnight is 12:00:00AM or 00:00:00 and 12 Noon is 12:00:00.

Input Format

Input consists of time in the AM/PM format i.e. hh:mm:ssAM or hh:mm:ssPM 
where 
01≤hh≤12 
00≤mm≤59 
00≤ss≤59

Output Format

You need to print the time in 24 hour format i.e. hh:mm:ss 
where 
00≤hh≤23 
00≤mm≤59 
00≤ss≤59
*/



import java.io.*;
import java.util.*;

public class TimeConversion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String[] time = sc.nextLine().split(":");
        
        String hours = time[0];
        String minutes = time[1];
        String seconds = time[2].substring(0,2);
        String dayEve = time[2].substring(2,4);
        if(dayEve.equals("AM")){
            System.out.println((hours.equals("12")?"00":hours) +":"+minutes+":"+seconds);
        }else{
            System.out.println((hours.equals("12")?hours:(Integer.parseInt(hours)+12))+":"+minutes+":"+seconds);
        }
    }
}