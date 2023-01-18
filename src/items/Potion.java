package items;

public class Potion extends Item {

    private final int healingPoints = 100;

    public Potion(String name, String description) {
        super(name, description);
    }

    public int getHealingPoints() {
        return healingPoints;
    }

}
