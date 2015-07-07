/* Fizz Buzz
Write a short program that prints (to STDOUT) the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".

The goal is to write the shortest code possible.

Scoring: Your score is (200 - number of characters in your source code)/10
*/

/* The solutions is 131 characters */

class F{static public void main(String[]b){for(int i=0;i<100;System.out.println((++i%3<1?"Fizz":"")+(i%5<1?"Buzz":i%3<1?"":i)));}}

