package pt.ulusofona.lp2.greatprogrammingjourney.boarditems.abyss;

import pt.ulusofona.lp2.greatprogrammingjourney.player.Player;

public class BlueScreenOfDeathAbyss extends Abyss {
    /* constructor */
    public BlueScreenOfDeathAbyss() {
        super(7, "Blue Screen of Death");
    }

    /* method */
    @Override
    public String react(Player player) {
        return null;
    }
}