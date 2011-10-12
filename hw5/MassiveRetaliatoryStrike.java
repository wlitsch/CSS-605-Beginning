/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author William
 */
public class MassiveRetaliatoryStrike implements Player{
    
    private int score;
    private int oppMove;
    private boolean sentinel;
    private static final int COOPERATE = 0;
    private static final int DEFECT = 1;
    
    public MassiveRetaliatoryStrike(){
        score = 0;
        sentinel = false;
        oppMove = COOPERATE;
    }
    
    public String toString() {
        return("MassiveRetaliatoryStrike" );
    }
    
    public int makeMove() {  
        
        if (sentinel){
            return DEFECT;
        } else if (oppMove == DEFECT){
            sentinel = true;
            return DEFECT;
        } else {
            return COOPERATE;   
        }
        
    }
    
    public void setScore(int myMove, int oppMove, int myScore, int oppScore){
        score = score + myScore;
        this.oppMove = oppMove;   
        //System.out.println(toString() + "'s Score: " + myScore + " oppScore: " + oppScore);
    }
    
    public int getScore() {
        return(score);
    }
   
    public void reset(){
        score = 0;
        sentinel = false;
        oppMove = COOPERATE;
    }
    
}
