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
	public void commandExecute() {
		this.magicBoard.setToy("кукла",hairColor,height,width,eyeColor);
	}

	@Override
	public void setAdditionalDetailsForToy(String... additionalDetails) {
		this.hairColor = additionalDetails[0];
        this.height = additionalDetails[1];
        this.width = additionalDetails[2];
        this.eyeColor = additionalDetails[3];
	}
}
