package main.commands.drivetrain;

import interfacesAndAbstracts.ImprovedCommand;
import interfacesAndAbstracts.SwitchCommand;
import main.Robot;

public class SwitchDrive extends SwitchCommand {

	public SwitchDrive(ImprovedCommand trueCommand, ImprovedCommand falseCommand) {
		super(trueCommand, falseCommand);
	}

	@Override
	public boolean source() {
		return Robot.pn.isTankMode();
	}

}
