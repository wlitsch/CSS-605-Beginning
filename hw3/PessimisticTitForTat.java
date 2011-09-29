/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author William
 */
public class PessimisticTitForTat implements Player {
    
    private int score;
    private int oppMove;
    
    public PessimisticTitForTat(){
        oppMove = 1;
    }
    
    public String toString() {
        return("PessimisticTitForTat" );
    }
    
    public int makeMove() {  
        
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
        oppMove = 1;
    }
}
