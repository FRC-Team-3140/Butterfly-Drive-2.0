package main.commands.popper;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import interfacesAndAbstracts.ImprovedCommandGroup;
import main.Constants;

/**
 *
 */
public class PopperUp extends ImprovedCommandGroup implements Constants {

    public PopperUp() {
    	addSequential(new Popper(EXT));
    	addSequential(new WaitCommand(0.3));
    	addSequential(new Popper(OFF));
    }
}
