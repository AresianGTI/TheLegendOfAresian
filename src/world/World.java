package world;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class World {

    private List<Location> locations;

    private Location currentLocation;

    public World(Location startLocation) {
        this.generateWorld(startLocation);
    }

    private void generateWorld(Location startLocation){
        this.currentLocation = startLocation;
        this.locations = new ArrayList<>();
        this.locations.add(startLocation);
        this.worldLocations.forEach(((location) ->  this.locations.add(location)));
    }

    public String getCurrentSituation() {
        String situation = "Aktueller Ort: " + this.currentLocation.getName() + "\n";
        if (!this.currentLocation.isAlreadyVisited()){
            situation += this.currentLocation.getDescription() + "\n";
            this.currentLocation.setVisied();
        }

        return situation;
    }


    ArrayList<Location> worldLocations = new ArrayList<Location>(Arrays.asList(
        new Location("Eingangshalle", "Ein leerer Raum, vor dir jeweils links und rechts Treppen, die nach unten führen."),
        new Location("Keller 1 West", "Du kommst unten an in einem schlecht beleuchteten Raum. Es gibt zwei Türen, einer führt nach weiter nach norden, der andere nach links. Es kommen Goblins auf dich zu!."),
        new Location("Keller 1 Ost", "Du kommst unten an in einem schlecht beleuchteten Raum. Es kommen Goblins auf dich zu!."),
        new Location("Speisekammer", "Du befindest dich in einer Speisekammer wieder, die aber sonst nirgends hinführt."),
        new Location("Festsaal", "Ein großer langer Gang erwartet dich, der nur geradeaus führt. Und da rennen schon die nächsten Gegner auf dich zu."),
        new Location("Thronvorhof", "Ein quadratischer Raum mit je einer Tür in jede Richting. Leider wachen hier 3 Oger, die dich bemerkt haben."),
        new Location("Koeniglicher Kerker 1", "Ein Gefängnis, in welchem sich 2 Oger befinden. Hinter dir die einzige Tür, durch die du durchgekommen bist."),
        new Location("Koeniglicher Kerker 2", "Ein Gefängis, in welchem sich diesmal 3 Oger befinden. Hinter dir die einzige Tür, durch die du durchgekommen bist."),
        new Location("Königsthron", "Du bist im Thron des Goblinkönigs, welcher gerade auf seinem Thron sitzt, umgeben von Untertanen."),
        new Location("Kleiner Raum mit Treppe ", "Du befindest dich in einem Raum, in dem sich eine Treppe nach unten befindet."),
        new Location("Raum mit großer Mauer", "Unten angelangt wartet vor dir eine große Wand und eine goldene Türe. Dahinter hörst du eine laute Kreatur."),
        new Location("Drachenverließ", "Eine große Halle, in welcher sich ein Drache befindet. Dahinter siehst du eine versiegelte Tür, hinter welcher sich Mihiro befindet."),
        new Location("Ogerverließ", "Ein Kerker, in welchem sich 3 Oger befinden. Geradeaus eine Tür aus Silber."),
        new Location("Schatzkammer", "Du befindest dich in einer Schatzkammer wieder. Die einzige Tür ist die, welche du zum Reinkommen verwendet hast.")
        )  
    );
    
    
}
