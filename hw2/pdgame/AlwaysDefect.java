/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author William
 */
public class AlwaysDefect implements Player {
    
    private int score;
    
    public String toString() {
        return("AlwaysDefect's score is: " + score );
    }
    
    public int makeMove() {  
        return(1);
    }
    
    public void setScore(int myMove, int oppMove, int myScore, int oppScore){
        this.score = score + myScore;
        System.out.println("myScore: " + myScore + " oppScore: " + oppScore);
    }
   
    public void reset(){
        
    }
}
