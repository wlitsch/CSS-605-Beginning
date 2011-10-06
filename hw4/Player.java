/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;
import java.io.*;
/**
 *
 * @author William and Maksim
 */
public interface Player {
    String toString();
    //int makeMove();
    int makeMove() throws IOException;
    void setScore(int myMove, int oppMove, int myScore, int oppScore);
    int getScore();
    void reset();
}
