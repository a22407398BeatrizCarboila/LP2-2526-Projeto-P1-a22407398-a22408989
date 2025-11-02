package pt.ulusofona.lp2.greatprogrammingjourney;

import pt.ulusofona.lp2.greatprogrammingjourney.enums.Color;

import java.util.ArrayList;
import java.util.List;

public abstract class Programmer {
    /* fields */
    protected int id;
    protected String name;
    protected List<String> favoriteLanguages = new ArrayList<>();
    protected Color avatarColor;

    /* constructor */
    public Programmer(int id, String name, String languagesStr, Color color) {
        this.id = id;
        this.name = name;
        this.avatarColor = color;

        if (languagesStr != null && !languagesStr.isEmpty()) {
            String[] languages = languagesStr.split(";");
            for (String l : languages) {
                this.favoriteLanguages.add(l.trim());
            }
        }
    }

    /* getters */
    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public List<String> getFavoriteLanguages(){
        return favoriteLanguages;
    }

    public Color getAvatarColor(){
        return avatarColor;
    }

    /* setters */
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
}
