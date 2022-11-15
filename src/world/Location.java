package world;

public class Location {
    private String name;

    private String description;
    
    private boolean alreadyVisited;

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

    
    
}
