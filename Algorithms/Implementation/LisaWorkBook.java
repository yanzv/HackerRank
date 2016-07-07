import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LisaWorkBook {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numChapters = sc.nextInt();
        int numProblemsPerPage = sc.nextInt();
        int[] numProblemsInChapter = new int[numChapters];
        for(int i = 0;i < numProblemsInChapter.length;i++){
        	numProblemsInChapter[i] = sc.nextInt();
        }

        int numSpecialProblems = 0;
        int pos = 0;
        int currentPage = 1;
        for(int i = 0;i < numChapters;i++)
        {
        	int numProblemsCurrentChapter = numProblemsInChapter[i];
        	int numProblemsInCurrentPage = 0;
        	int numPages = (int) Math.ceil(numProblemsCurrentChapter / numProblemsPerPage);
        	int currentNumProblem = 1;

        	for(int j = 1;j <= numPages;j++){
        		
        		if( (j * numProblemsPerPage) > numProblemsCurrentChapter){
        			numProblemsInCurrentPage = numProblemsCurrentChapter - ((j-1) * numProblemsPerPage);
        		}else{
        			numProblemsInCurrentPage = numProblemsPerPage;
        		}

        		if(currentNumProblem >= j && (currentNumProblem+numProblemsInCurrentPage) <= j){
        			numSpecialProblems++;
        		}
        		currentNumProblem+=numProblemsPerPage;
   
        	}
        		
        }
        System.out.println(numSpecialProblems);
    }
}