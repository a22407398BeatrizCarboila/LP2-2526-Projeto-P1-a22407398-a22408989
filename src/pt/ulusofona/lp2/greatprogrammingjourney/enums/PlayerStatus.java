package pt.ulusofona.lp2.greatprogrammingjourney.enums;

public enum PlayerStatus {
    /* constants */
    IN_GAME("Em Jogo"),
    DEFEATED("Derrotado");

    /* fields */
    private final String displayName;

    /* getters */
    public String getDisplayName() {
        return displayName;
    }

    /* constructors */
    PlayerStatus(String displayName) {
        this.displayName = displayName;
    }
}
