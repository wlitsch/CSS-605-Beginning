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
        game.setRounds(100);
        int multiples = 30;
        for (int i = 0; i < multiples; i++){
            
            game.addPlayer(new AlwaysDefect());             // 3000x1: 0.162, 100x30: 0.172
            game.addPlayer(new AlwaysCooperate());          // 3000x1: 0.146, 100x30: 0.138
            game.addPlayer(new MassiveRetaliatoryStrike()); // 3000x1: 0.127, 100x30: 0.123
            game.addPlayer(new OptimisticTitForTat());      // 3000x1: 0.127, 100x30: 0.122
            game.addPlayer(new PessimisticTitForTat());     // 3000x1: 0.151, 100x30: 0.163
            game.addPlayer(new RandomAction());             // 3000x1: 0.177, 100x30: 0.178
            game.addPlayer(new TitForTatWithReward());     // 3000x1: 0.110, 100x30: 0.108
            //game.addPlayer(new TitForTatWithForgiveness());  // 3000x1: 0.129,100x30: 0.123
            //game.addPlayer(new TitForTatWithRandomness());  // 3000x1: 0.113 ,100x30: 0.112
            //game.addPlayer(new TitForTatWithBonusAndRandomness());     // 3000x1: 0.112, 100x30: 0.110
        }
        
        game.playNoReplacementEveryoneOnceTournament();
        game.reportFinalScore(multiples);
    }
}
