/*
Java Regex 3 - Username Checker

Regular expressions (regexp) help us match or search for patterns in strings. In this problem, you will be given a username. 
Your task is to check whether that username is valid. A valid username will have the following properties:

The username can contain alphanumeric characters and/or underscores(_).
The username must start with an alphabetic character.
8 ≤ |Username| ≤ 30.
To simplify your task, we have provided a portion of the code in the editor. You just need to write down the regex pattern 
which will be used to validate the username input.

Input Format

The first line of input contains an integer N, representing the number of testcases. Each of the next N lines contains a 
string that represents a username.

Constraints

The username consists of any printable characters.

1≤N≤50
Output Format

For each username, output Valid if the username is valid; otherwise, output Invalid.

Sample Input

4
alpha_naheed
xahidbuffon
nagib@007
123Swakkhar

Sample Output

Valid
Valid
Invalid
Invalid
*/


 String pattern = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

