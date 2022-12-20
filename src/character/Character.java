package character;

import enums.Gender;

public class Character {
    protected String name;
    protected int strength;
    protected int defense;
    protected Gender gender;

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
}
