package pt.ulusofona.lp2.greatprogrammingjourney.boarditems.abyss;

import pt.ulusofona.lp2.greatprogrammingjourney.player.Player;

public class FileNotFoundExceptionAbyss extends Abyss {
    /* constructor */
    public FileNotFoundExceptionAbyss() {
        super(3, "FileNotFoundException");
    }

    /* method */
    @Override
    public String react(Player player) {
        return null;
    }
}