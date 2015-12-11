/* Java Instanceof keyword

The Java instanceof operator is used to test if the object or instance is an instanceof the specified type.

In this problem we have given you three classes in the editor, Student, Rockstar and Hacker. In the main 
function we populated an ArrayList with instances of these classes. count method counts how many instance of each 
type are present in the ArrayList. Some lines of the code are missing, and you have to fix it by modifying only 3 lines!

To restore the original code in the editor, click on the top left icon in the editor and create a new buffer.

Sample Input

5
Student
Student
Rockstar
Student
Hacker

Sample Output

3 1 1


*/

import java.util.*;


class Student{}
class Rockstar{   }
class Hacker{}


public class JavaInstanceOf
{
   static String count(ArrayList mylist)
   {
      int a=0,b=0,c=0;
      for(int i=0;i<mylist.size();i++)
      {
         Object element=mylist.get(i);
         if(element instanceof Student)
            a++;
         if(element instanceof Rockstar)
            b++;
         if(element instanceof Hacker)
            c++;
      }
      String ret= Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
      return ret;
   }

   public static void main(String []argh)
   {
      ArrayList mylist=new ArrayList();
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      for(int i=0;i<t;i++)
      {
         String s=sc.next();
         if(s.equals("Student"))mylist.add(new Student());
         if(s.equals("Rockstar"))mylist.add(new Rockstar());
         if(s.equals("Hacker"))mylist.add(new Hacker());
      }
      System.out.println(count(mylist));
   }
}