/* Java Singleton

"The singleton pattern is a design pattern that restricts the instantiation of a class to one object. 
This is useful when exactly one object is needed to coordinate actions across the system." 
- Wikipedia: Singleton Pattern

Complete the Singleton class in your editor which contains the following components:

A private Singleton non parameterized constructor.
A public String instance variable named .
Write a static method named getSingleInstance that returns the single instance of the Singleton class.
Once submitted, our hidden Solution class will check your code by taking a String as input and 
then using your Singleton class to print a line.

Input Format

You will not be handling any input in this challenge.

Output Format

You will not be producing any output in this challenge.

Sample Input

hello world
Sample Output

Hello I am a singleton! Let me say hello world to you

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaSingleton
{

	public String str;
    private static Singleton singleton = new Singleton();
    
    private Singleton(){};
    
    public static Singleton getSingleInstance()
    {
        return singleton;
    }
}