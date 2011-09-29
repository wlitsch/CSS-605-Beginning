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
    private int score;
    private int oppMove;
    private int myMove;
    private int counter;
    
    public TitForTatWithForgiveness(){
        oppMove = 0;
        counter = 0;
    }
    
    public String toString() {
        return("TitForTatWithForgiveness" );
    }
    
    public int makeMove() {  
        // Random r = new Random();
        if (myMove == 1 ) {
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
        myMove = 0;
        counter = 0;
    }
}
