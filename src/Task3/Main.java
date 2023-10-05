package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<>();
        Room r1 = new Room(3, 3, 4);
        Room r2 = new Room(2, 2, 4);
        Room r3 = new Room(4, 4, 5);
        rooms.add(r1);//3.h Add the three rooms to a collection (preferably of the same data type used for the "rooms" field in your Building.java class).
        rooms.add(r2);
        rooms.add(r3);

Building building = new Building(rooms,1,6,true);

isNormal(building);



        }


        public static int countLampsInBuilding(Building building) {
        int sum = 0;
            for(Room r: building.getRooms()){
                sum+=r.getNumberOfLamps();

            }
            return sum;
        }
        public static boolean isNormal(Building b){

        if(b.getNumberOfFloors()>b.getRooms().size()) {
            System.out.println("true");
            return true;
        }else{
                System.out.println("This is an odd building, false");
                return false;
        }

        }
}