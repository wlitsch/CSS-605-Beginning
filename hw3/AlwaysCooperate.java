/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author William
 */
public class AlwaysCooperate implements Player{
    
    private int score;
    
    public String toString() {
        return("AlwaysCooperate" );
    }
    
    public int makeMove() {  
        return(0);
    }
    
    public void setScore(int myMove, int oppMove, int myScore, int oppScore){
        this.score = score + myScore;
        //System.out.println(toString() + "'s Score: " + myScore + " oppScore: " + oppScore);
    }
    
     public int getScore() {
        return(score);
    }
   
    public void reset(){
        
    }
    
}
