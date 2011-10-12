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
    
    int cumulativeScore;   // score so far (for a single match)
    Node currentNode;
    Node root = new Node(0);
    Random r = new Random();
    
    public LearningTree(){
       cumulativeScore = 0;
    }
    
    public String toString() {
        return("LearningTree" );
    }
    /**
     * Make the current move.
     * 
     * @return 
     */
    public int makeMove() {  
        switch (currentNode.howManyNodes()) {
         
            case 2:
                currentNode = currentNode.chooseBetweenTwo();
                return currentNode.getValue();
            case 1:
                // in the future a bayesian rationale should be implemented to determine best option
                // this is an overly simple first try at this. A future function that uses the standard 
                // deviation of the expectation value and the expectation value should be used
                currentNode = currentNode.chooseBetweenOne();     
                return currentNode.getValue();
            case 0:
                // in the future a bayesian rational should be implemented to determine best option
                currentNode = currentNode.chooseBetweenNone();
                return currentNode.getValue();
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
