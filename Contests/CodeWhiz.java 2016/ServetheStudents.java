/* Serve the Students

In this problem, there are  types of events: ENTER (a student enters the queue) or SERVED.

A unique token is assigned to any student entering the queue. The queue serves the students 
based on the following criteria:

The student having the highest Cumulative Grade Point Average (CGPA) is served first.
Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
Any students having the same CGPA and name will be served in ascending token order.
Given a sequence of  events, print the names of students who are yet to be served(based on above criteria). 
If the queue is empty, print EMPTY.

Input Format

The first line of input contains an integer, , denoting the total number of events. 
Each of the subsequent lines will be of the following two forms:

ENTER name CGPA token - The student to be inserted into the priority queue.
SERVED - The highest priority student in the queue was served.
Constraints


 where 
 where each token i is a unique integer.

Output Format

Print the names (based on the criteria) of the students who are not served at all after executing all  events; if every student in the queue was served, then print EMPTY.

Sample Input

12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED
Sample Output

Dan
Ashley
Shafaet
Maria
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
   private int token;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
   
   public int compareTo(Student s)
   {
       if(this.cgpa < s.cgpa){  
           return -1;
       }else if (this.cgpa > s.cgpa){
            return 1; 
       }
       if(this.fname.compareTo(s.fname) > 0){
           return -1;
       }else if(this.fname.compareTo(s.fname) < 0){
           return 1;
       }else{
            if(this.token < s.token){ 
               return -1;
            }
       }
       return 1;
   }
       
   public String toString()
   {
       return ""+ this.token +" " + this.fname + " " + this.cgpa;
   }
}

public class ServetheStudents {

    public static ArrayList<Student> studentQueue = new ArrayList<>();
    
    public static void insertStudent(Student s)
    {
        int insertPos = 0;
        for(int i = 0;i < studentQueue.size() ;i++){
            if(studentQueue.get(insertPos).compareTo(s)>0){
                insertPos = i+1;
            }else{
                break;
            }
        }
        studentQueue.add(insertPos,s);
    }
    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
      while(totalEvents>0){
        String[] eventArr = in.nextLine().split(" ");
        if(eventArr.length == 1){
            if(!studentQueue.isEmpty()){
                studentQueue.remove(0);
            }
        }else{
            Student s = new Student(Integer.parseInt(eventArr[3]),eventArr[1],Double.parseDouble(eventArr[2]));
            insertStudent(s);
        }      
         totalEvents--;
      }
        if(studentQueue.size() > 0){
            for(int i = 0;i <studentQueue.size();i++){
                System.out.println(studentQueue.get(i).getFname());
            }
        }else{
            System.out.println("EMPTY");
        }
            
    }
}

