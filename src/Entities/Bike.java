package Entities;

import java.util.Date;

public class Bike extends Toy {
	
	private String color;
    private String category;
    private String brand;
    private int numberOfWheels;
    private int numberOfGears;

	public Bike(Date dateOfCreation, String toyName, String creator, String[] additionalDetails) {
		super(dateOfCreation, toyName, creator, additionalDetails);
		
		this.setColor(additionalDetails[0]);
        this.setNumberOfWheels(additionalDetails[1]);
        this.setNumberOfGears(additionalDetails[2]);
        this.setCategory(additionalDetails[3]);
        this.setBrand(additionalDetails[4]);
	}

	 private void setColor(String color){
	     this.color = color;
	 }

	 private String getColor(){
	     return this.color;
	 }

	 private void setNumberOfWheels(String numberOfWheels){
	     this.numberOfWheels = Integer.parseInt(numberOfWheels);
	 }

	 private int getNumberOfWheels(){
	     return this.numberOfWheels;
	 }

	 private void setNumberOfGears(String numberOfGears){
	     this.numberOfGears = Integer.parseInt(numberOfGears);
	 }

	 private int getNumberOfGears(){
	     return this.numberOfGears;
	 }

	 private void setCategory(String category){
	     this.category = category;
	 }

	 private String getCategory(){
	     return this.category;
	 }
	 
	 private void setBrand(String brand) {
		 this.brand = brand;
	 }
	 
	 private String getBrand() {
		 return this.brand;
	 }
	 
	 @Override
	    public String toString() {
	        String currentToy = String.format("%s - Цвят: %s, с %d колелета и %d скорости на марката %s",
	                            this.getCategory().toUpperCase(),
	                            this.getColor(),
	                            this.getNumberOfWheels(),
	                            this.getNumberOfGears(),
	        					this.getBrand());

	        String creationData = super.toString();

	        return currentToy + System.lineSeparator() + creationData;
	    }
}
