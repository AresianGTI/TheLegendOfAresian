package world;

import java.util.ArrayList;
import java.util.List;

public class World {

    private List<Location> locations;

    private Location currentLocation;

    public World(Location startLocation) {
        this.currentLocation = startLocation;
        this.locations = new ArrayList<>();
        this.locations.add(startLocation);
    }

    public String getCurrentSituation() {
        String situation = "Aktueller Ort: " + this.currentLocation.getName() + "\n";
        if (!this.currentLocation.isAlreadyVisited()){
            situation += this.currentLocation.getDescription() + "\n";
            this.currentLocation.setVisied();
        }

        return situation;
    }



    
    
}
