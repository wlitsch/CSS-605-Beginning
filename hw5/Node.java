/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author William
 */
public class Node {
    
    int value;                         // the value of the node (cooperate = 0 or defect = 1) in this model
    int count;                            // the number of times that this node has been reached
    int cumulativeScore;                   // the total cumulative score up to this point in the tree
    int expectationScore;                   // the average of all the known final scores budding from this node
    Node[] nextTurn = new Node[2];            // an array containing either 2, 1, or 0 nodes with data from previous traversals, the second element is always the true node
    Random r = new Random();
    
    public Node (int value){
        this.value = value;
        count = 0;
        cumulativeScore = 0;
        expectationScore = 0;
    }
    
    public double getExpectation() {
        return expectationScore;
    }
    
    public int getValue() {
        return value;
    }
    /**
     * in the future this method should choose between two expectation values while 
     * also accounting for the risk or standard deviation around the expected value
     * or perhaps even use both full distributions
     * @return 
     */
    public int howManyNodes() {
        if (nextTurn[0] == null && nextTurn[1] == null){
            return 0;
        } else if ( nextTurn[0] == null ^ nextTurn[1] == null) {
            return 1;
        } else {
            return 2;
        }
    }
    
    public Node chooseBetweenTwo() {
        if (nextTurn[0].getExpectation() < nextTurn[1].getExpectation()){
            return nextTurn[0];
        } else if (nextTurn[0].getExpectation() > nextTurn[1].getExpectation()) {
            return nextTurn[1];
        } else {                      // then it is equal
            return nextTurn[r.nextInt(2)];
        }
    }
    
    public Node chooseBetweenOne() {
        //boolean right = nextTurn[0] == null;
        if (nextTurn[0] == null) {   // node on the right is filled
           nextTurn[1].getExpectation()
        } else {                     // node on the left side is filled
           
        }
    }
    
    public Node chooseBetweenNone() {
        return r.nextInt(2);
    }
    
    public void addNode(boolean value){
        if (value) {
            nextTurn[1] = new Node();
        } else {
            nextTurn[0] = new Node();
        }
    }
}
