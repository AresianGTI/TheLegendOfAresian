package items;

public class Key extends Item {

    private final String keyID;

    public Key(String name, String description, String id) {
        super(name, description);
        this.keyID = id;
    }

    public String getKeyID() {
        return keyID;
    }

}