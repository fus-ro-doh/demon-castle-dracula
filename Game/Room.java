/**
* Overview:   a file for testing concepts
*
* @author:  Daniel W. Jaeger
* @version: 1.0
* Date:     8/8/20
**/

// import java.util.Random;

public class Room {

    private String name; 
    private String description;
    private Room exit;
    private Room routeA;
    private Room routeB;
    // private Random random;

    public Room(String name, String description) {
        this.description = description;
        this.name = name;
        exit = null;
        routeA = null;
        routeB =null;
    }

    // public void setName(String name){
    //     this.name = name;
    // }

    public String getName(){
        return name;
    }

    public String getDescription() {
        return description;
    }

    // public int getRandomNumber(){
    //     return random.nextInt(8);
    // }

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

