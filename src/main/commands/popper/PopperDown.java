package main.commands.popper;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import main.Constants;

/**
 *
 */
public class PopperDown extends CommandGroup implements Constants {

    public PopperDown() {
    	addSequential(new Popper(RET));
    	addSequential(new WaitCommand(0.3));
    	addSequential(new Popper(OFF));
    }
}
