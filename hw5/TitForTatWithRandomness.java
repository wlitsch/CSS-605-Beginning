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
    
    private static final int COOPERATE = 0;
    private static final int DEFECT = 1;
    private int score;
    private int oppMove;
    private Random r = new Random();
    
    public TitForTatWithRandomness(){
        score = 0;
        oppMove = COOPERATE;
    }
    
    public String toString() {
        return("TitForTatWithRandomness" );
    }
    
    public int makeMove() {  
        if (r.nextFloat() < 0.1) {
            return COOPERATE;
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
        score = 0;
        oppMove = COOPERATE;
    }
}
