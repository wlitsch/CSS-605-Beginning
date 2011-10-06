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
public class LearningTree implements Player{
    
    int cumulativeScore = 0;
    Node currentNode;
    Node root = new Node();
    Random r = new Random();
    
    public LearningTree(){
       
    }
    
    public String toString() {
        return("LearningTree" );
    }
    
    public int makeMove() {  
        switch (currentNode.howManyNodes()) {
         
            case 2:
                return currentNode.chooseBetweenTwo();
            case 1:
                // in the future a bayesian rational should be implemented to determine best option
                // this is an overly simple first try at this. A future function that uses the standard 
                // deviation of the expectation value and the expectation value should be used
                return currentNode.chooseBetweenOne();       
            case 0:
                // in the future a bayesian rational should be implemented to determine best option
                return currentNode.chooseBetweenNone();
            default:
                return 1;
        }
    }
    
    public void setScore(int myMove, int oppMove, int myScore, int oppScore) {    
       cumulativeScore += myScore;
    }
   
    public int getScore() {
       return cumulativeScore;
    }
    
    public void reset(){
      
    }
    /**
     * prints out tree so that a LearningTree player can read in the tree and
     * continue to learn
     */
    public void printTree(){
        
    }
    
    /**
     * reads in tree so that LearningTree player can continue to learn
     */
    public void readTree(){
        
    }
    
    /**
     * determines the probability that the user is human based on previous experience with humans
     */
    public void probabilityHuman() {
        
    }
}
