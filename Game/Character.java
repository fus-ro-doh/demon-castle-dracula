


abstract class Character{

	protected String name; 
    protected String description;

    // protected Character(String name, String description){
    // 	this.name = name;
    // 	this.description = description;
    // }

    protected void setName(){
        this.name = name;
    }

    protected String getName(){
        return this.name;
    }

	protected void setDescription(){
        this.description = description;
    }

    protected String getDescription(){
        return this.description;
    }

    @Override
    public String toString(){
    	String val = "" + description;
    	return val;
    }

}//end abstract class