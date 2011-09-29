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
public class TitForTatWithRandomness implements Player{
    
    private int score;
    private int oppMove;
    private Random r = new Random();
    
    public TitForTatWithRandomness(){
        oppMove = 0;
    }
    
    public String toString() {
        return("TitForTatWithRandomness" );
    }
    
    public int makeMove() {  
        if (r.nextFloat() < 0.1) {
            return 0;
        }
        return oppMove;
    }
    
    public void setScore(int myMove, int oppMove, int myScore, int oppScore){
        this.score = score + myScore;
        this.oppMove = oppMove;      
        //System.out.println(toString() + "'s Score: " + myScore + " oppScore: " + oppScore);
    }
    
     public int getScore() {
        return(score);
    }
   
    public void reset(){
        oppMove = 0;
    }
}
