/**
* Overview:	Class that defines Room objects. 
*
* @author:  Daniel W. Jaeger
* @version: 1.2
* Date:     8/17/20
**/


public class Room{

    private String name; 
    private String description;
    private Room room;
    private Room exit;
    private Room routeA;
    private Room routeB;

    protected Room(String name, String description){
        this.name = name;
        this.description = description;
        exit = null;
        routeA = null;
        routeB =null;
    }

    protected String getName(){
        return name;
    }

    protected String getDescription(){
        return description;
    }

    protected void setRouteA(Room a){
        this.routeA = a;
    }   

    protected Room getRouteA(){
        return routeA;
    }

    protected void setRouteB(Room b){
        this.routeB = b;
    }

    protected Room getRouteB(){
        return routeB;
    }

    protected void setRoutes(Room a, Room b){
        setRouteA(a);
        setRouteB(b);
    }

    protected void setExit(Room exit){
        this.exit = exit;
    }

    protected Room getExit(){
        return exit;
    }

    protected void setRoom(Room room){
        this.room = room;
    }

    protected Room getRoom(){
        return room;
    }

    @Override
    public String toString(){
        String val = "" + description;
        return  val;
    }

} // end class

