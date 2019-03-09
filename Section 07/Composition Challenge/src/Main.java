public class Main {
    public static void main(String[] args) {
        /*
        Create a single room of a house using composition.
        Think about the things that should be included in the room.
        Maybe physical parts of the house but furniture as well
        Add at least one method to access an object via a getter and
        then that objects public method as you saw in the previous video
        then add at least one method to hide the object e.g. not using a getter
        but to access the object used in composition within the main class
        like you saw in this video.
         */
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Elvar's", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
