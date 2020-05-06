package example.android.tourguide;

public class Word {

    private int image, name, address, timing;

    public Word(int image, int name, int address, int timing) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.timing = timing;

    }

    public int getImage() {
        return image;
    }

    public int getName() {
        return name;
    }

    public int getAddress() {
        return address;
    }

    public int getTiming() {
        return timing;
    }
}
