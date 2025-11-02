package pt.ulusofona.lp2.greatprogrammingjourney;

public class Slot {
    /* fields */
    private int index;
    private String imageFileName;

    /* constructor */
    public Slot(int index) {
        this.index = index;
        this.imageFileName = null;
    }

    /* getters */
    public int getIndex() {
        return index;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    /* setters */
    public void setImageFileName(String imageName) {
        this.imageFileName = imageName;
    }
}
