/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author William
 */
public class OptimisticTitForTat implements Player {
    
    private int score;
    private int oppMove;
    
    public OptimisticTitForTat(){
        oppMove = 0;
    }
    
    public String toString() {
        return("OptimisticTitForTat's score is: " + score );
    }
    
    public int makeMove() {  
        
        return oppMove;
    }
    
    public void setScore(int myMove, int oppMove, int myScore, int oppScore){
        this.score = score + myScore;
        this.oppMove = oppMove;      
        System.out.println("myScore: " + myScore + " oppScore: " + oppScore);
    }
   
    public void reset(){
        oppMove = 0;
    }
}
