/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author William
 */
public class AlwaysDefect implements Player {
    
    private static final int COOPERATE = 0;
    private static final int DEFECT = 1;
    private int score;
    
    public AlwaysDefect() {
        score = 0;
    }
    public String toString() {
        return("AlwaysDefect");
    }
    
    public int makeMove() {  
        return(DEFECT);
    }
    
    public void setScore(int myMove, int oppMove, int myScore, int oppScore){
        this.score = score + myScore;
        //System.out.println(toString() + "'s Score: " + myScore + " oppScore: " + oppScore);
    }
    
     public int getScore() {
        return(score);
    }
   
    public void reset(){
        score = 0;
    }
}
