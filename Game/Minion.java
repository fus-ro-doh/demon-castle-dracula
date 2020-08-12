



public class Minion{

	private String name; 
    private String description;

    protected Minion(String name, String description) {
        this.name = name;
        this.description = description;
    }

    protected String getName(){
        return name;
    }

    protected String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        String val = "" + description;
        return  val;
    }


}//end class