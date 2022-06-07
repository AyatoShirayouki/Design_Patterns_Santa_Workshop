import Entities.Dwarf;
import Entities.MagicBoard;
import Entities.Santa;
import Entities.Workshop;

public class Main {

	public static void main(String[] args) {
		Workshop workshop = new Workshop();

	    String fileLocation = "src/ExecutableCommands.txt";

	    MagicBoard magicBoard= new MagicBoard();
	    Dwarf firstDwarf = new Dwarf(magicBoard,"Alex", workshop);
	    Dwarf secondDwarf = new Dwarf(magicBoard,"A.Kuzmov", workshop);
	    Dwarf thirdDwarf = new Dwarf(magicBoard,"Rado", workshop);
	    Dwarf fourthDwarf = new Dwarf(magicBoard,"Atilata", workshop);
	    Dwarf fifthDwarf = new Dwarf(magicBoard,"Dancho", workshop);
	    Dwarf sixthDwarf = new Dwarf(magicBoard,"Tianko", workshop);
	    Dwarf seventhDwarf = new Dwarf(magicBoard,"Gosho", workshop);
	    Dwarf eighthDwarf = new Dwarf(magicBoard,"Icaka", workshop);

	    magicBoard.assignDwarfToMagicBoard(firstDwarf);
	    magicBoard.assignDwarfToMagicBoard(secondDwarf);
	    magicBoard.assignDwarfToMagicBoard(thirdDwarf);
	    magicBoard.assignDwarfToMagicBoard(fourthDwarf);
	    magicBoard.assignDwarfToMagicBoard(fifthDwarf);
	    magicBoard.assignDwarfToMagicBoard(sixthDwarf);
	    magicBoard.assignDwarfToMagicBoard(seventhDwarf);
	    magicBoard.assignDwarfToMagicBoard(eighthDwarf);

	    Santa santa = new Santa(magicBoard);
	    santa.readCommandsFromInputFile(fileLocation);
	    
	    try{
	        santa.SantaCommandExecutor();
	        System.out.println("\n" + santa.getCommandsCount() + " commands have been executed.");
	    }catch(Exception e){
	        System.out.println("End of operations."); 
	    }
	}

}
