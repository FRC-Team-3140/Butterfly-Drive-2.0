package main.commands.popper;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import main.Constants;

/**
 *
 */
public class PopDown extends CommandGroup implements Constants {

    public PopDown() {
    	addSequential(new Pop(RET));
    	addSequential(new WaitCommand(0.1));
    	addSequential(new Pop(OFF));
    }
}
