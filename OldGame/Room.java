/**
*
*Description: Room Class used for building room objects for my dungeon.
*
*@author: Daniel Jaeger
*@version 11/8/17
*/

public class Room {

    private String description;
    private Room roomToNorth;
    private Room roomToSouth;
    private Room roomToEast;
    private Room roomToWest;

    public Room(String description) {
        this.description = description;
        roomToNorth = null;
        roomToSouth = null;
        roomToEast  = null;
        roomToWest  = null;
    }

    public String getDescription() {
        return description;
    }

    public void setRoomToNorth(Room n) {
       this.roomToNorth = n;
    }

    public Room getRoomToNorth() {
        return roomToNorth;
    }

    public void setRoomToSouth(Room s) {
       this.roomToSouth = s;
    }

    public Room getRoomToSouth() {
        return roomToSouth;
    }

    public void setRoomToEast(Room e) {
       this.roomToEast = e;
    }

    public Room getRoomToEast() {
        return roomToEast;
    }

    public void setRoomToWest(Room w) {
        this.roomToWest = w;
    }

    public Room getRoomToWest() {
        return roomToWest;
    }

    public void setExits(Room n, Room e, Room s, Room w){
    	setRoomToNorth(n);
    	setRoomToEast(e);
    	setRoomToSouth(s);
    	setRoomToWest(w);
    }

    public String getExits(){
    	return description;
    }

    @Override
    public String toString() {
        String val = "" + description;
        return  val;
    }

} // end class

