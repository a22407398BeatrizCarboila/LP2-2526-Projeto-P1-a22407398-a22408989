package pt.ulusofona.lp2.greatprogrammingjourney.boarditems.abyss;

import pt.ulusofona.lp2.greatprogrammingjourney.player.Player;

public class SyntaxErrorAbyss extends Abyss {
    /* constructor */
    public SyntaxErrorAbyss() {
        super(0, "Erro de Sintaxe");
    }

    /* method */
    @Override
    public String react(Player player) {
        return null;
    }
}
