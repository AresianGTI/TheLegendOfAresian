package items;

public class Potion extends Item {

    private final int healingPoints = 100;

    public Potion() {
        this.name = "Heiltrank";
        this.description = "Heilt 100 Lebenspunkte";
    }

    public int getHealingPoints() {
        return healingPoints;
    }

}
