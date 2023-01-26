package enums;

public enum LocationName {
    GATE_PATH("Burgtor"),
    ENTRY_HALL("Eingangshalle"),
    BASEMENT1_WEST("Keller 1 West"),
    PANTRY("Speisekammer"),
    BALLROOM("Festsaal"),
    THRONE_COURT("Thronvorhof"),
    ROYAL_PRISON1("Koeniglicher Kerker 1"),
    ROYAL_PRISON2("Koeniglicher Kerker 2"),
    KINGS_THRONE("Königsthron"),
    BASEMENT1_EAST("Keller 1 Ost"),
    OGRE_ROOM("Ogerverließ"),
    TREASURY("Schatzkammer"),
    SMALL_ROOM("Kleiner Raum mit Treppe"),
    WALL_ROOM("Raum mit großer Mauer"),
    DRAGON_ROOM("Drachenverließ");

    public final String label;

    private LocationName(String label) {
        this.label = label;
    }
}