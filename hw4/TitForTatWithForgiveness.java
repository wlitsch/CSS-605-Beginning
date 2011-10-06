/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author William
 */
public class TitForTatWithForgiveness implements Player {
    
    private static final int COOPERATE = 0;
    private static final int DEFECT = 1;
    private int score;
    private int oppMove;
    private int myMove;
    private int counter;
    
    public TitForTatWithForgiveness(){
        oppMove = COOPERATE;
        counter = 0;
    }
    
    public String toString() {
        return("TitForTatWithForgiveness" );
    }
    
    public int makeMove() {  
        // Random r = new Random();
        if (myMove == DEFECT ) {
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
        myMove = COOPERATE;
        counter = 0;
    }
}
