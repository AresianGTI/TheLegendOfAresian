package world;

import java.util.ArrayList;

import enums.LocationName;
import items.Item;

public class Location {

    private final String name;

    private final String description;
    
    private boolean alreadyVisited;

    private ArrayList<LocationName> possiblePaths =  new ArrayList<LocationName>();


    private ArrayList<Item> lyingItems = new ArrayList<Item>();

    public Location(String name, String description, ArrayList<LocationName> paths, ArrayList<Item> items) {
        this.name = name;
        this.description = description;
        this.alreadyVisited = false;
        this.possiblePaths = paths;
        this.lyingItems = items;
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

    public ArrayList<LocationName> getPossiblePaths() {
        return possiblePaths;
    }

    public ArrayList<Item> getLyingItems() {
        return lyingItems;
    }

       
    
}
