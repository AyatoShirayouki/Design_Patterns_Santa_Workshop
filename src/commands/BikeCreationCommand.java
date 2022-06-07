package commands;

import Entities.MagicBoard;

public class BikeCreationCommand implements Santa_ToyCommandInterface{

	private MagicBoard magicBoard;

    private String color;
    private String category;
    private String brand;
    private String numberOfWheels;
    private String numberOfGears;
    
    public BikeCreationCommand(MagicBoard magicBoard){
        this.magicBoard = magicBoard;
    }
	
	@Override
	public void execute() {
		this.magicBoard.setToy("колело",color,numberOfWheels,numberOfGears,category,brand);
	}

	@Override
	public void setToyDetails(String... details) {
		this.color = details[0];
        this.numberOfWheels = details[1];
        this.numberOfGears = details[2];
        this.category = details[3];
        this.brand = details[4];
	}

}
