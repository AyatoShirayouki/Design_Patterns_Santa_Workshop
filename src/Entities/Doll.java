package Entities;

import java.util.Date;

public class Doll extends Toy{
	
	private String hairColor;
	private String eyeColor;
    private double height;
    private double width;

	public Doll(Date dateOfCreation, String toyName, String creator, String[] additionalDetails) {
		super(dateOfCreation, toyName, creator, additionalDetails);
		
		this.setHairColor(additionalDetails[0]);
        this.setHeight(additionalDetails[1]);
        this.setWidth(additionalDetails[2]);
        this.setEyeColor(additionalDetails[3]);
	}

	private void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }

    private String getHairColor(){
        return this.hairColor;
    }

    private void setHeight(String height){
        this.height = Double.parseDouble(height);
    }

    private double getHeight(){
        return this.height;
    }

    private void setWidth(String width){
        this.width = Double.parseDouble(width);
    }

    private double getWidth(){
        return this.width;
    }
    
    private void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }

    private String getEyeColor(){
        return this.eyeColor;
    }
    
    @Override
    public String toString() {
        String currentToy = String.format("Кукла с %s коса, %s очи, %f висока и %f широка",
                this.getHairColor(),
                this.getEyeColor(),
                this.getHeight(),
                this.getWidth());

        String creationData = super.toString();

        return currentToy + System.lineSeparator() + creationData;
    }
}
