/**
* Overview:	Class that defines Room objects. 
*
* @author:  Daniel W. Jaeger
* @version: 1.1
* Date:     8/9/20
**/


public class Room {

    private String name; 
    private String description;
    private Room exit;
    private Room routeA;
    private Room routeB;

    public Room(String name, String description) {
        this.description = description;
        this.name = name;
        exit = null;
        routeA = null;
        routeB =null;
    }

    public String getName(){
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setRouteA(Room a){
        this.routeA = a;
    }   

    public Room getRouteA(){
        return routeA;
    }

    public void setRouteB(Room b){
        this.routeB = b;
    }

    public Room getRouteB(){
        return routeB;
    }

    public void setRoutes(Room a, Room b){
        setRouteA(a);
        setRouteB(b);
    }

    public void setExit(Room exit){
        this.exit = exit;
    }

    public Room getExit(){
        return exit;
    }

    @Override
    public String toString() {
        String val = "" + description;
        return  val;
    }

} // end class

