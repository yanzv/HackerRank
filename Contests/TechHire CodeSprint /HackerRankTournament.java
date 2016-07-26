
/* HackerRank Tournament

HackerRank just ended a programming tournament consisting of  contests where each contest  had  teams compete. 
For each contest, there is a leaderboard that lists the respective  (number of problem solved during that contest) and time  
(specific to that contest) for each team that participated in the contest.

HackerRank wants you to assemble the tournament's final leaderboard according to the following rules:

It must contain data for all teams who participated in at least one of the tournament's contests.
A team's final  is the total number of problems the team solved across all the contests they participated in.
A team's final time  is the sum of their time penalties for each contest they participated in.
Assigning final :
Rankings are assigned according to Standard Competition Ranking, meaning that the  assigned to each team is equal to  the number of teams ranked higher than that team. For example, if teams and  tie for  and team  came in next, then team  will have .
Teams are ranked according to their final , which is the sum of all scores achieved in individual contests. 
The team(s) who solved the most problems must be ranked highest, and the team(s) who solved the least problems 
must be ranked lowest.
If two teams have the same final , the team having the lesser final time  must be ranked higher than the team 
having the greater final time .
If two teams have the same final  and final  (i.e., there is a tie), then they have the same . 
Teams having the same  should be ordered alphabetically (or lexicographically for alphanumeric team names) by team .
Given the contest leaderboard for each contest in the tournament, print the final tournament leaderboard. 
Each line must contain four space-separated values describing a team's respective , , final , and final time . 
Order your output by non-decreasing rank according to the rules stated above.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Team  implements Comparable {
    String name;
    int score;
    int penalty;
        
   public Team(String name, int score, int penalty){
            
        this.name = name;
        this.score = score;
        this.penalty = penalty;
   }
        
   public int compareTo(Object o2)
   {
        Team team1 = this;
        Team team2 = (Team)o2;
            
        if(this.score < team2.score) {
            return 1; 
        } else if (this.score > team2.score) {
            return -1;
        } else if (this.penalty < team2.penalty) {
            return -1;
        } else if (this.penalty > team2.penalty) {
            return 1;
        } 
        return this.name.compareTo(team2.name);
    }
    public String toString()
    {
        return "" + name +" " + score +" "+ penalty;  
    }
}

public class HackerRankTournament{
    
     
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        */
        Scanner sc = new Scanner(System.in);
        int numContests = sc.nextInt();
        HashMap<String, Team> teamsMap = new HashMap<>();
         
        for(int i = 0; i < numContests; i++){
            int numTeams = sc.nextInt();
            sc.nextLine();
            for(int j = 0;j < numTeams; j++){
                String[] strArray = sc.nextLine().split(" ");
                String teamName = strArray[0];
                int score = Integer.parseInt(strArray[1]);
                int penalty = Integer.parseInt(strArray[2]);
                Team team = teamsMap.get(teamName);
                if(team != null){
                    team.score += score;
                    team.penalty += penalty;
                }else {
                    team =  new Team(teamName,score,penalty);
                    teamsMap.put(teamName, team);
                }
            }
        }
        Team[] teamsArray = new Team[teamsMap.size()];
        int index = 0;
        for(Team team : teamsMap.values()) {
            teamsArray[index++] = team;
        }
        Arrays.sort(teamsArray);
        index = 0;
        int currentScore = 0; 
        int currentPenalty = 0;
        for(int i = 0; i < teamsArray.length; i++ ){
            Team team = teamsArray[i];
            if(team.score == currentScore && team.penalty == currentPenalty ){
                System.out.println(""+index + " " + team);
            } else {
                index = i + 1;
                System.out.println("" + (index) + " " + team);
                currentScore = team.score;
                currentPenalty = team.penalty;
            }
        }
        
    }
}