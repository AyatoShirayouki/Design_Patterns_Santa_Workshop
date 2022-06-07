package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Toy {
	
	private Date dateOfCreation;
	private String creator;
	private String toyName;
    private SimpleDateFormat dateFormatter;
    
    public Toy(Date dateOfCreation, String toyName, String creator, String...additionalDetails) {
    	this.setCreator(creator);
    	this.setDateOfCreation(dateOfCreation);
    	this.setToyName(toyName);
    	this.dateFormatter = new SimpleDateFormat("yyyy-MM-dd в HH:mm:ss часа");
    }
    
    private void setCreator(String dwarfName){
        this.creator = dwarfName;
    }

    protected String getCreator(){
        return this.creator;
    }

    private void setDateOfCreation(Date dateOfCreation){
        this.dateOfCreation = dateOfCreation;
    }

    protected String getDateOfCreation(){
        return dateFormatter.format(this.dateOfCreation);
    }
    
    private void setToyName(String toyName) {
    	this.toyName = toyName;
    }
    
    protected String getToyName() {
    	return this.toyName;
    }
    
    @Override
    public String toString() {
        return String.format("%s създаде %s на %s",this.getToyName() ,this.getCreator(), this.getDateOfCreation());
    }
}
