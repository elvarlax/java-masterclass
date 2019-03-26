import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    /*
    The challenge is to work out what is wrong with the location constructor
    that would allow the program to compile and crash at runtime so when you identify the problem modify
    the code to fix it so I just i’ll just say that again your challenge here is to work out what is wrong
    with the location constructor that you can see on screen line 20 that will allow the program to compile
    but crash on run time when you identify the problem modify the code to fix it.
    */

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if (exits != null) this.exits = new HashMap<>(exits);
        else this.exits = new HashMap<>();
        this.exits.put("Q", 0);
    }

    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
