package main.commands.arm;

import edu.wpi.first.wpilibj.command.WaitCommand;
import interfacesAndAbstracts.ImprovedCommandGroup;

public class OpenArm extends ImprovedCommandGroup {
	
	public OpenArm() {
		addSequential( new Arm(EXT));
		addSequential(new WaitCommand(0.1));
		addSequential(new Arm(OFF));
	}

}
