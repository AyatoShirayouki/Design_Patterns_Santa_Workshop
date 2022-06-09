package Entities;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import commands.BikeCreationCommand;
import commands.DollCreationCommand;
import commands.Santa_ToyCommandInterface;

public class Santa {
	private ArrayList<String> commands;
	
	Santa_ToyCommandInterface bikeCommand;
	Santa_ToyCommandInterface dollCommand;
	
	public Santa(MagicBoard magicBoard){
        this.dollCommand = new DollCreationCommand(magicBoard);
        this.bikeCommand = new BikeCreationCommand(magicBoard);
    }
	
	public void readCommandsFromInputFile(String fileLocation){
        try (Stream<String> lines = Files.lines(Paths.get(fileLocation),Charset.defaultCharset())) {
            this.commands = (ArrayList<String>) lines.collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("End");
        }
    }
	
	public void SantaCommandExecutor(){
        for(String command : commands){

            String[] commandParts = command.split("-");

            String commandType = commandParts[0];
            String toyType = commandParts[1];

            if (commandType.equalsIgnoreCase("Трябват ми")){

                if(toyType.equalsIgnoreCase(("кукли"))){
                    this.dollCommand.setAdditionalDetailsForToy(commandParts[2], commandParts[3], commandParts[4], commandParts[5]);
                    this.dollCommand.commandExecute();

                }else if(toyType.equalsIgnoreCase("колелета")){
                    this.bikeCommand.setAdditionalDetailsForToy(commandParts[2], commandParts[3], commandParts[4], commandParts[5], commandParts[6]);
                    this.bikeCommand.commandExecute();
                }

            }
        }
    }
	
	public int getNumberOfExecutedCommands(){
        return this.commands.size();
    }
}
