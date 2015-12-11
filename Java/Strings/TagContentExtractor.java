/*
Tag Content Extractor

In a tag based language, like XML or HTML, contents are enclosed by a start tag and an end tag. For example:

<tag>contents</tag>
In this problem, you will be given a text in a tag based language. Your task is to parse this text and retrieve 
the contents which are enclosed by well organized tag sequences. Well organized tags maintain the following constraints:

The name of the start and end tag must be same. The following HTML code is not valid:

<h1>Hello World</h2>
Tag can be nested, but there will be no content in between the nested tags. The following code is not valid:

<h1><a>contents</a>invalid</h1>
Tags can consist of any printable characters.

Input Format

The first line of input contains a single integer N, representing the number of lines. The next N lines 
contains a line of text.

Constraints

1<=N<=100
Each line contains at most 104 printable characters. The total number of characters in all test cases will not exceed 106.

Output Format

For each line, print the valid content enclosed by proper tags. If there is multiple valid content in a test case, 
print out each of the valid content on separate lines. If no valid content is found in a test case, print "None" without quotes.

Sample Input

4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while<par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>

Sample Output

Nayeem loves counseling
Sanjay has no watch
So wait for a while
None
Imtiaz has a secret crush
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContentExtractor{
   
   public static void main(String[] args){
   	
       Scanner in = new Scanner(System.in);
       int testCases = Integer.parseInt(in.nextLine());
       String regexPatern = "(<[^>]*>)";
       Pattern stringPatern  = Pattern.compile(regexPatern);
      	while(testCases>0){
      		String line = in.nextLine();
          	int pos = 0;
          	Matcher m = stringPatern.matcher(line);
          	String previousHTMLTag = null;
          	int previousTagPos = -1;
          	boolean didFind = false;
          	while(m.find())
          	{	
              	String htmlTag = line.substring(m.start(),m.end());
              	if(htmlTag.charAt(1) != '/')
              	{
	            	previousHTMLTag = htmlTag;
	               	previousTagPos = m.end();
              	}else if(htmlTag.charAt(1) == '/' && previousHTMLTag != null){
                  	if(previousHTMLTag.substring(1).equals(htmlTag.substring(2))&&previousHTMLTag.length()>2 && m.start()>previousTagPos+1){
                    	System.out.println(line.substring(previousTagPos,m.start()));
                      	didFind = true;
                  	}
                	previousHTMLTag = null;
              	}
                  
          	}
          	System.out.print(didFind?"":"None\n");
          	testCases--;
        }
          
    }
}

