/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;
import java.util.Random;
/**
 *
 * @author William
 */
public class RandomAction implements Player{
    
    private int score;
    
    public String toString() {
        return("RandomAction" );
    }
    
    public int makeMove() {  
        Random r = new Random();
        return r.nextInt(2);
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
