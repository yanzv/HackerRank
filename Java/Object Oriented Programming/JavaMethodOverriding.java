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

    String getName(){
        return "Generic Sports";
    }
  
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }

    // Write your overridden getNumberOfTeamMembers method here
void getNumberOfTeamMembers()
   {
      System.out.println("Each team has 11 players in "+getName());
   }

}

public class Solution{
	
    public static void main(String []args){
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
	}
}
