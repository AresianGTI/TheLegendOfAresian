package enums;

public enum Gender {
    MALE("male"),
    FEMALE("female"),
    LGBTQ("LGBTQ+");

    public final String label;

    private Gender(String label) {
        this.label = label;
    }
}
