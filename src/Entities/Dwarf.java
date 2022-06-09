package Entities;

import observables.ObserverInterface;

public class Dwarf implements ObserverInterface{

	private MagicBoard magicBoard;
	private String name;

    private String toyType;
    private String[] toyTypeDetails;

    private Toy createdToy;

    private Workshop workshop;
    
    public Dwarf(MagicBoard board,String dwarfName, Workshop workshop){
        this.magicBoard = board;
        this.setName(dwarfName);
        this.workshop = new Workshop();
    }
	
	@Override
	public void getDetailsForToy() {
		this.toyType = this.magicBoard.getToyType();
        this.toyTypeDetails = this.magicBoard.getToyDetails();

        createdToy = workshop.create(this.getName(),this.toyType,this.toyTypeDetails);

        System.out.println(System.lineSeparator() + createdToy);
	}

	private void setName(String dwarfName){
        this.name = dwarfName;
    }
	
	@Override
	public String getName() {
		return this.name;
	}
	

}
