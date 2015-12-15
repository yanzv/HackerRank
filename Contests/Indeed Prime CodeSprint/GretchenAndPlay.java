/* Gretchen and the Play

Gretchen is directing a new play with M scenes performed by N actors, where each actor only appears in exactly one scene. 
To ensure that the distribution is perfect, she performs the following actions:

Assign actor Ni to scene Mi.
Count the number of scenes having less than P actors assigned to them.
Given a list of actions, determine the distribution of actors in Gretchen's play.

Input Format

The first line contains three space-separated integers, M, N, and Q, respectively; M is the number of scenes, 
N is the number of actors, and Q is the number of actions Gretchen plans to perform. N and M use zero-based indexing.

The second line contains N space-separated integers; the ith integer represents the scene, Mi, that actor Ni is i
nitially assigned to.

The Q subsequent lines describe Gretchen's actions; each of these lines starts with an integer, A, which corresponds 
to Action 1 or Action 2 (as detailed in the Problem Statement).

When A=1 (Action 1), it will be followed by two space-separated integers, Ni and Mi, respectively; this action 
says to assign actor Ni to scene Mi.

When A=2 (Action 2), it will be followed by a single integer, P; this action says to count the number of segments 
having <P actors assigned to them.

Note: All Action 1 actions are permanent, so each Action 1 affects all future actions.

Constraints: 
1≤M,N,Q≤105 
0≤Mi≤M−1 
0≤Ni≤N−1 
1≤P≤N

Output Format

For each Action 2, print the number of scenes having <P actors on a new line.

Sample Input

5 5 6
0 1 2 3 4
2 2
1 0 2
2 2
2 1
1 3 1
2 2

Sample Output

5
4
1
3
*/

import java.io.*;
import java.util.*;

public class GretchenAndPlay {

 
    public static void main(String[] args) {
    
        Integer one = new Integer(1);
        Scanner sc = new Scanner(System.in);
        
        int numOfScenes  = sc.nextInt();
        int numOfActors = sc.nextInt();
        int numOfActions = sc.nextInt();
        sc.nextLine();
        
        String[] actorsAssigmentsArray = sc.nextLine().split(" ");
        HashMap<Integer,Integer> scencesMap = new HashMap<Integer,Integer>();  //stores number of actors for a specific scene
        
        //cachedSearchMap stores the amount of scenecs have certain amount of actors
        //For example there are 2 scences with 3 actors, 5 scences with 1 actor
        //They keys are in sorted ordered so they can be itterated to find out count the number of scenes having <P actors

        TreeMap<Integer,Integer> cachedSearchMap = new TreeMap<Integer,Integer>(); 
        Integer numActorsInScene = 0;
        
        for(int i = 0;i<actorsAssigmentsArray.length;i++){
            //load the scenes map and cachedsearch map
            int scenePos = Integer.parseInt(actorsAssigmentsArray[i]);
            numActorsInScene = scencesMap.remove(scenePos);
            if(numActorsInScene != null){
               
                scencesMap.put(scenePos,numActorsInScene+1);
                Integer prvSmValue = cachedSearchMap.get(numActorsInScene+1);
                if(prvSmValue != null){
                    cachedSearchMap.put(new Integer(numActorsInScene+1),prvSmValue+1);
                }else{
                    cachedSearchMap.put(new Integer(numActorsInScene+1),one);
                }
                
                Integer smValue = cachedSearchMap.remove(numActorsInScene);
                if(smValue != null && smValue > 1){
                    cachedSearchMap.put(new Integer(numActorsInScene),smValue-1); 
                }
                
            }else{
                scencesMap.put(scenePos,one);
                Integer smValue = cachedSearchMap.get(one);
                if(smValue != null){
                    cachedSearchMap.put(one, smValue+1);
                }else{
                    cachedSearchMap.put(one,one);
                }
            }
        }
        for(int i = 0; i < numOfActions;i++)
        {

            int actionType = sc.nextInt();
            if(actionType == 2 ){
                int actorsCount = sc.nextInt();

                    int total = 0;
                    //itterates through search tree to sum up the scences that have <P actors
                    for(Integer num : cachedSearchMap.keySet()){
                        if(num < actorsCount){
                            total+=cachedSearchMap.get(num);
                        }else {
                            break;
                        }
                    }
                    int scenesWithOutActors = numOfScenes - scencesMap.size();
                    System.out.println(""+(total+scenesWithOutActors));

                
            }else if(actionType == 1){
                int actNum = sc.nextInt();
                
                int prevPos = Integer.parseInt(actorsAssigmentsArray[actNum]);
                int pos = sc.nextInt();
                actorsAssigmentsArray[actNum] = ""+pos;
                
                int prevNumActors = scencesMap.remove(prevPos);

                    if(prevNumActors > 1){
                        scencesMap.put(prevPos,prevNumActors-1);
                    }

                //moving actors from one scene to another will require to update cachedSearchMap and add count to 
                //actors new position and subctract one from previous
               Integer prvNumValue = cachedSearchMap.remove(prevNumActors);
                if(prvNumValue != null && prvNumValue > 1){
                    cachedSearchMap.put(new Integer(prevNumActors),prvNumValue-1);
                }
               
              
               if((prevNumActors-1) > 0 ) {
                   Integer prvNumActorsOneVal = cachedSearchMap.get(prevNumActors-1);

                   if(prvNumActorsOneVal != null){
                       cachedSearchMap.put(new Integer(prevNumActors-1), prvNumActorsOneVal+1);
                   }else{
                       cachedSearchMap.put(new Integer(prevNumActors-1), one);
                   }
                }
                Integer posNumValue = scencesMap.get(pos);
                int posNumActors = 1;
                if(posNumValue != null){
                    scencesMap.put(pos, posNumValue+1);
                    posNumActors = posNumValue+1;
                }else{
                    scencesMap.put(pos, one);
                }

                Integer smValue = cachedSearchMap.remove(posNumActors-1);
                if(smValue != null && smValue > 1){
                    cachedSearchMap.put(new Integer(posNumActors-1),smValue-1); 
                }
                smValue = cachedSearchMap.get(posNumActors);
                if(smValue != null){
                    cachedSearchMap.put(new Integer(posNumActors), smValue+1);
                }else{
                    cachedSearchMap.put(new Integer(posNumActors), one);
                }
            }
            
        }
    }
}