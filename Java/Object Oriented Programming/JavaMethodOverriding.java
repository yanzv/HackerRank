/* Java Method Overriding 

When a subclass inherits a superclass, it can override methods of the superclass. Consider the following Sports class:

class Sports{

   String get_name()
   {
      return "Generic Sports";
   }
   void get_number_of_team_members()
   {
       System.out.println("Each team has n players in "+get_name());
   }
}
Now we want to create a Soccer class that inherits the Sports class. We can override the get_name 
method and return a different string.

class Sports{

   String get_name()
   {
      return "Soccer Class";
   }

}
Note that to override a method, the parameters and return type of the new method should be exactly same as the old method.

Your task is simple, you are given a partially completed code in the editor, complete the code so that 
it prints the following lines:

Generic Sports
Each team has n players in Generic Sports
Soccer Class
Each team has 11 players in Soccer Class


*/

import java.util.*;
class Sports{

   String get_name()
   {
      return "Generic Sports";
   }
   void get_number_of_team_members()
   {
      System.out.println("Each team has n players in "+get_name());
   }
}

class Soccer extends Sports
{
   String get_name()
   {
      return "Soccer Class";
   }
    void get_number_of_team_members()
   {
      System.out.println("Each team has 11 players in "+get_name());
   }
}
public class JavaMethodOverriding
{
   
   public static void main(String []args)
   {
      Sports C1=new Sports();
      Soccer C2=new Soccer();
      System.out.println(C1.get_name());
      C1.get_number_of_team_members();
      System.out.println(C2.get_name());
      C2.get_number_of_team_members();
   }
}