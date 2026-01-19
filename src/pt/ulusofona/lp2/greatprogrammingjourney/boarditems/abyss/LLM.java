package pt.ulusofona.lp2.greatprogrammingjourney.boarditems.abyss;

import pt.ulusofona.lp2.greatprogrammingjourney.player.Player;

public class LLM extends Abyss {

    public LLM() {
        super(20, "LLM");
    }

    @Override
    public String react(Player player, int turnNumber) {
        if (turnNumber <= 3) {
            if (player.hasToolThatCancels(this)) {
                player.consumeToolThatCancels(this);
                return "LLM anulado por Ajuda Do Professor";
            }
            int previous = player.getPreviousPosition();
            player.setCurrentPosition(previous);
            return "Caiu no LLM! Recua para a posição onde estava antes";
        }
        int lastMove = player.getLastMoveDistance();
        int newPosition = player.getCurrentPosition() + lastMove;

        player.setCurrentPosition(newPosition);

        return "Caiu no LLM mas já tem experiência! Avança tantas casas quantas as do último movimento";
    }
}
