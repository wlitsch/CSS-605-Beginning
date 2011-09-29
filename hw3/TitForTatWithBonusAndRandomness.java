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
public class TitForTatWithBonusAndRandomness implements Player {
    private int score;
    private int oppMove;
    private int myMove;
    private int counter;
    private Random r = new Random();
    
    public TitForTatWithBonusAndRandomness(){
        oppMove = 0;
        counter = 0;
    }
    
    public String toString() {
        return("TitForTatWithBonusAndRandomness" );
    }
    
    public int makeMove() {  
        if (r.nextFloat() < 0.05) {
            return 0;
        }
        if (myMove == 0 ) {
            counter++; 
            
        }
        if (counter > 4) {
            counter = 0;
            return 0;
        } else {
            return oppMove;
        }
    }
    
    public void setScore(int myMove, int oppMove, int myScore, int oppScore) {    
        this.score = score + myScore;
        this.oppMove = oppMove;   
        this.myMove = myMove;
        //System.out.println(toString() + "'s Score: " + myScore + " oppScore: " + oppScore);
    }
   
     public int getScore() {
        return(score);
    }
    
    public void reset(){
        oppMove = 0;
        //myMove = 0;
        //counter = 0;
    }
}
