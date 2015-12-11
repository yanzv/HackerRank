/* Java Comparator

Comparators are used to compare two objects to sort them. This problem will test your knowledge on Java Comparators.

There are N players in a tournament. You will be given the name of each player and his score. 
You need to sort the players in decreasing order by score. If two players have the same score, the one 
whose name is lexicographically larger should appear first.

Note: We have already provided you with the partially completed code in the editor. Your task is to 
create the class Checker which uses a comparator desc to sort the players.

A string is lexicographically smaller than another string if it appears earlier in a standard dictionary. 
For example, "cat" is lexicographically smaller than "dog", but larger than "cab" or "ca".

Input Format

The first line contains an integer N, denoting the number of players. The next N lines contain the name of a player
and his score separated by a space. Two players can have the same name. A name will consist of lowercase 
English characters. The score of a player can range from 0 to 1000. You don't need to worry about any other constraints.

Output Format

Print each player and their space-separated score on a different line according to the directions in the problem statement.

Sample Input

5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150

Sample Output

aleksa 150
david 100
amy 100
aakansha 75
heraldo 50

*/

class Checker 
{
    
    Comparator<Player> desc = new Comparator<Player>() {

        @Override
        public int compare(Player o1, Player o2) {
           
            if(o1.score==o2.score){
                return o2.name.compareTo(o1.name);
            }
            return o1.score>o2.score?-1:1;
        }
    };
    
}