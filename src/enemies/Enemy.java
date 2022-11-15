package enemies;

public class Enemy {
    protected String name;
    protected int strength;
    protected int defense;
    protected double accuracy;

    public int doDamage() {
        return strength;
    }


    public String getName() {
        return name;
    }
    public int getStrength() {
        return strength;
    }
    public int getDefense() {
        return defense;
    }
    public double getAccuracy() {
        return accuracy;
    }

    
}
