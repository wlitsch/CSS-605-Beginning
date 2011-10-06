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
    
    private static final int COOPERATE = 0;
    private static final int DEFECT = 1;
    private int score;
    private int oppMove;
    private int myMove;
    private int counter;
    private Random r = new Random();
    
    public TitForTatWithBonusAndRandomness(){
        oppMove = COOPERATE;
        counter = 0;
    }
    
    public String toString() {
        return("TitForTatWithBonusAndRandomness" );
    }
    
    public int makeMove() {  
        if (r.nextFloat() < 0.05) {
            return COOPERATE;
        }
        if (myMove == COOPERATE ) {
            counter++; 
            
        }
        if (counter > 4) {
            counter = 0;
            return COOPERATE;
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
        oppMove = COOPERATE;
        //myMove = 0;
        //counter = 0;
    }
}
