package Entities;

import java.util.HashMap;

import observables.ObservableInterface;
import observables.ObserverInterface;

public class MagicBoard implements ObservableInterface {

	private String toyType;
    private String[] toyDetails;
    private HashMap<String,ObserverInterface> dwarfsAssignedToMagicBoard;
	
    public MagicBoard(){
        this.dwarfsAssignedToMagicBoard = new HashMap<String,ObserverInterface>();
    }
    
    public void setToy(String toyType,String...toyDetails){
        this.setToyType(toyType);
        this.setToyDetails(toyDetails);
        notifyAllDwarfs();
    }
    
    public String getToyType(){
        return this.toyType;
    }

    private void setToyType(String toyType){
        this.toyType = toyType;
    }

    public String[] getToyDetails(){
        return this.toyDetails;
    }

    private void setToyDetails(String[] toyDetails){
        this.toyDetails = toyDetails;
    }

    
	@Override
	public void assignDwarfToMagicBoard(ObserverInterface dwarf) {
		this.dwarfsAssignedToMagicBoard.put(dwarf.getName(),dwarf);
	}

	@Override
	public void releaseDwarfFromMagicBoard(String dwarfName) {
		this.dwarfsAssignedToMagicBoard.remove(dwarfName);
	}

	@Override
	public void notifyAllDwarfs() {
		dwarfsAssignedToMagicBoard.forEach((key,value)-> value.getDetailsForToy());
	}
}
