/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;
import java.io.*;
import java.lang.*;

/**
 *
 * @author William
 */
public class HumanPlayer implements Player {
    
    private int score;
    
    public HumanPlayer() {
        this.score = 0;
    }
    
    public String toString() {
        return("HumanPlayer");
    }
    
    public int makeMove() throws IOException {  
        System.out.println("Player make your move> ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(in.readLine());
    }
    
    public void setScore(int myMove, int oppMove, int myScore, int oppScore){
        this.score += myScore;
        System.out.println(toString() + "'s Move: " + myMove + " oppMove: " + oppMove);
        System.out.println(toString() + "'s Score: " + myScore + " oppScore: " + oppScore);
    }
    
     public int getScore() {
        return(score);
    }
   
    public void reset(){
        score = 0;
    }
    
}
