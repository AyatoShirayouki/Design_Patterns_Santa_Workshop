package commands;

import Entities.MagicBoard;

public class DollCreationCommand implements Santa_ToyCommandInterface {
	
	private MagicBoard magicBoard;

    private String hairColor;
    private String eyeColor;
    private String height;
    private String width;
    
    public DollCreationCommand(MagicBoard magicBoard){
        this.magicBoard = magicBoard;
    }
	
	@Override
	public void execute() {
		this.magicBoard.setToy("кукла",hairColor,height,width,eyeColor);
	}

	@Override
	public void setToyDetails(String... details) {
		this.hairColor = details[0];
        this.height = details[1];
        this.width = details[2];
        this.eyeColor = details[3];
	}
}
