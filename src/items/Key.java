package items;

public class Key extends Item {

    private final String ID;

    public Key(String keyID) {
        this.name = "Schlüssel";
        this.description = "Heilt 100 Lebenspunkte";
        this.ID = keyID;
    }

    public String getKeyID() {
        return ID;
    }

}