package Task3;

import java.util.ArrayList;

public class Building {
    private ArrayList<Room> rooms = new ArrayList<>();
    private int numberOBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    public Building(ArrayList<Room> rooms,int numberOBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.numberOBathrooms = numberOBathrooms;
        this.isOfficeBuilding = isOfficeBuilding;
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;


    }
    public int getNumberOBathrooms() {
        return numberOBathrooms;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}
