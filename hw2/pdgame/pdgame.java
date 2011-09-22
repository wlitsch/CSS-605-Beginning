/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdgame;

/**
 *
 * @author William
 */
public class pdgame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tournament game = new Tournament();
        game.setRounds(20);
        game.addPlayer(new AlwaysDefect());
        game.addPlayer(new AlwaysCooperate());
        game.addPlayer(new MassiveRetaliatoryStrike());
        game.addPlayer(new OptimisticTitForTat());
        game.addPlayer(new PessimisticTitForTat());
        game.playTournament();
        game.reportFinalScore();
    }
}
