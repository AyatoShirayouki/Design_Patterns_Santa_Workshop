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
	public void commandExecute() {
		this.magicBoard.setToy("колело",color,numberOfWheels,numberOfGears,category,brand);
	}

	@Override
	public void setAdditionalDetailsForToy(String... additionalDetails) {
		this.color = additionalDetails[0];
        this.numberOfWheels = additionalDetails[1];
        this.numberOfGears = additionalDetails[2];
        this.category = additionalDetails[3];
        this.brand = additionalDetails[4];
	}

}
