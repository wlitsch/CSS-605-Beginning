/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author William and Maksim
 */
public interface Player {
    String toString();
    int makeMove();
    void setScore(int myMove, int oppMove, int myScore, int oppScore);
    int getScore();
    void reset();
}
