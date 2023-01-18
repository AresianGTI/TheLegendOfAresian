package world;

import java.util.ArrayList;

public class Location {

    private String name;

    private String description;
    
    private boolean alreadyVisited;

    private ArrayList<String> possiblePaths =  new ArrayList<String>();


    private ArrayList<String> lyingItems = new ArrayList<String>();

    public Location(String name, String description) {
        this.name = name;
        this.description = description;
        this.alreadyVisited = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setVisied() {
        this.alreadyVisited = true;
    }


    public boolean isAlreadyVisited(){ //Bei Gettern von boolean Methoden wird immer "is" verwendet.
        return alreadyVisited;
    }

    public ArrayList<String> getPossiblePaths() {
        return possiblePaths;
    }

    public ArrayList<String> getLyingItems() {
        return lyingItems;
    }

    
    
}
