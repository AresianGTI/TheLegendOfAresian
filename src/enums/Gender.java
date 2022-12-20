package enums;

public enum Gender {
    MALE("male"),
    FEMALE("female"),
    LGTBQ("LGTBQ+");

    public final String label;

    private Gender(String label) {
        this.label = label;
    }
}
