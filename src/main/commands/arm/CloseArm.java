package main.commands.arm;

import edu.wpi.first.wpilibj.command.WaitCommand;
import interfacesAndAbstracts.ImprovedCommandGroup;

public class CloseArm extends ImprovedCommandGroup {
	public CloseArm() {
		addSequential( new Arm(RET));
		addSequential(new WaitCommand(0.1));
		addSequential(new Arm(OFF));
	}
}
