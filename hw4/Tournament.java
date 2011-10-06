/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

import java.util.*;
import java.io.*;

/**
 *
 * @author William
 */
public class Tournament {
    
    private PrintWriter out;
    private static final int COOPERATE = 0;
    private static final int DEFECT = 1;
    private int rounds;
    private ArrayList<Player> players;
    
    public Tournament() throws IOException {
        players = new ArrayList();
        this.out = new PrintWriter(new FileWriter("Player_Scores.txt")); 
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
    public void playNoReplacementEveryoneOnceTournament() throws IOException {
        for (int i = 0; i < players.size(); i++){
            for (int j = i+1; j < players.size(); j++){
                for (int k = 0; k < rounds; k++){    
                    playRound(players.get(i),players.get(j));
                }
                 printScore(players.get(i),players.get(j));
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
        this.out.close();
    }
    
    /**
     * @author Maksim
     * @param p1
     * @param p2 
     */
    private void playRound(Player p1, Player p2) throws IOException {   
        int m1=p1.makeMove();
        int m2=p2.makeMove();
        
        if (m1==COOPERATE && m2==COOPERATE) {
            p1.setScore(m1, m2, 1, 1);
            p2.setScore(m2, m1, 1, 1);
        } else if (m1==COOPERATE && m2==DEFECT) {
            p1.setScore(m1, m2, 5, 0);
            p2.setScore(m2, m1, 0, 5);
        } else if (m1==DEFECT && m2==COOPERATE) {
            p1.setScore(m1, m2, 0, 5);
            p2.setScore(m2, m1, 5, 0);
        } else if (m1==DEFECT && m2==DEFECT) {
            p1.setScore(m1, m2, 3,3);
            p2.setScore(m2, m1, 3,3);
        }
    }
    
    private void printScore(Player p1, Player p2) throws IOException {
        //String out = new String(p1.toString() + " " + p1.getScore() + " " + p2.toString() + " " + p2.getScore());
        //System.out.println(out);
        this.out.println(p1.toString() + " " + p1.getScore() + " " + p2.toString() + " " + p2.getScore()); 
        //out.close();
    }
    
}
