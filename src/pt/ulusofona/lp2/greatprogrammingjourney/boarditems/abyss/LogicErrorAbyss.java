package pt.ulusofona.lp2.greatprogrammingjourney.boarditems.abyss;

import pt.ulusofona.lp2.greatprogrammingjourney.player.Player;

public class LogicErrorAbyss extends Abyss {
    /* constructor */
    public LogicErrorAbyss() {
        super(1, "Erro de Lógica");
    }

    /* method */
    @Override
    public String react(Player player) {
        return null;
    }
}