package pt.ulusofona.lp2.greatprogrammingjourney.core;

import pt.ulusofona.lp2.greatprogrammingjourney.player.Player;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TurnManager {
    /* fields */
    private Queue<Player> playerOrder;
    private Player currentPlayer;

    /* constructor */
    public TurnManager(ArrayList<Player> players) {
        this.playerOrder = new LinkedList<>(players);
        this.currentPlayer = playerOrder.peek();
    }

    /* getters */
    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    /* methods */
    public int getCurrentPlayerID() {
        return currentPlayer.getId();
    }

    public void nextTurn() {
        if (!playerOrder.isEmpty()) {
            playerOrder.add(playerOrder.poll());
            currentPlayer = playerOrder.peek();
        }
    }
}
