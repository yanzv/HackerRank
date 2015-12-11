/* Java Ingeritance 1

Using Inheritance one class can acquire the properties of others. Consider the following Animal class:

class Animal{
    void walk()
    {
        System.out.println("I am walking");
    }
}
This class has only one method walk. Now we want to create a Bird class that also has fly method. 
We can do it using extends keyword.

class Bird extends Animal
{
    void fly()
    {
        System.out.println("I am flying");
    }
}
Now we can create a Bird object that can both fly and walk.

public class Solution
{
   public static void main(String args[])
   {

      Bird bird = new Bird();
      bird.walk();
      bird.fly();
   }
}
This code will print:

I am walking
I am flying
So Bird has all the properties that an animal have and it also have some unique properties.

Your task is very simple. We provided the code above in the editor. Just add a sing method in the 
Bird class and modify main function accordingly so that it prints the following lines:

I am walking
I am flying
I am singing

*/

class Animal{
   void walk()
   {
      System.out.println("I am walking");
   }
}

class Bird extends Animal
{
   void fly()
   {
      System.out.println("I am flying");
   }
    void sing()
   {
      System.out.println("I am singing");
   }
}
public class JavaInheritance1
{

   public static void main(String args[])
   {

     Bird bird = new Bird();
     bird.walk();
     bird.fly();
     bird.sing();
   
   }
}