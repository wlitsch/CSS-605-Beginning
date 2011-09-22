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
    
    public MassiveRetaliatoryStrike(){
        sentinel = false;
    }
    
    public String toString() {
        return("MassiveRetaliatoryStrike's score is: " + score );
    }
    
    public int makeMove() {  
        
        if (sentinel){
            return 1;
        }
        else if (oppMove == 1){
            sentinel = true;
            return 1;
        }
        else {
            return(0);   
        }
        
    }
    
    public void setScore(int myMove, int oppMove, int myScore, int oppScore){
        this.score = score + myScore;
        this.oppMove = oppMove;   
        System.out.println("myScore: " + myScore + " oppScore: " + oppScore);
    }
   
    public void reset(){
        sentinel = false;
    }
    
}
