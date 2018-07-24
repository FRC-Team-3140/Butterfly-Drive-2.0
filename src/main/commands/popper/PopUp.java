package main.commands.popper;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import main.Constants;
import main.commands.popper.Pop;

/**
 *
 */
public class PopUp extends CommandGroup implements Constants {

    public PopUp() {
    	addSequential(new Pop(EXT));
    	addSequential(new WaitCommand(0.1));
    	addSequential(new Pop(OFF));
    }
}
