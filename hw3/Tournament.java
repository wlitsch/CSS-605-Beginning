/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

import java.util.*;
/**
 *
 * @author William
 */
public class Tournament {
    
    private int rounds;
    private ArrayList<Player> players;
    
    public Tournament() {
        players = new ArrayList();
    }
    
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    
    public void addPlayer(Player p){
        players.add(p);
    }
    /**
     * playTournament plays each player once but does not play oneself
     */
    public void playNoReplacementEveryoneOnceTournament() {
        for (int i = 0; i < players.size(); i++){
            for (int j = i+1; j < players.size(); j++){
                for (int k = 0; k < rounds; k++){    
                    playRound(players.get(i),players.get(j));
                }
                 players.get(i).reset();
                 players.get(j).reset();
            }
            
        }
       
    }
    
    public void reportFinalScore(int multiples) {
        double totalScore = 0;
         for (int i = 0; i < players.size(); i++){
            totalScore += players.get(i).getScore();
        }
        for (int i = 0; i < players.size(); i++){
            System.out.println((players.get(i)).toString() + "'s scoring percentage is: " + (players.get(i)).getScore()/totalScore*multiples);
        }
    }
    
    /**
     * @author Maksim
     * @param p1
     * @param p2 
     */
    private void playRound(Player p1, Player p2) {   
        int m1=p1.makeMove();
        int m2=p2.makeMove();
        
        if (m1==0 && m2==0) {
            p1.setScore(m1, m2, 1, 1);
            p2.setScore(m2, m1, 1, 1);
        } else if (m1==0 && m2==1) {
            p1.setScore(m1, m2, 5, 0);
            p2.setScore(m2, m1, 0, 5);
        } else if (m1==1 && m2==0) {
            p1.setScore(m1, m2, 0, 5);
            p2.setScore(m2, m1, 5, 0);
        } else if (m1==1 && m2==1) {
            p1.setScore(m1, m2, 3,3);
            p2.setScore(m2, m1, 3,3);
        }
    }
    
}
