package main.commands.popper;

import interfacesAndAbstracts.ImprovedCommandGroup;
import interfacesAndAbstracts.SwitchCommandGroup;
import main.Robot;

public class SwitchPopper extends SwitchCommandGroup {

	public SwitchPopper(ImprovedCommandGroup trueCommand, ImprovedCommandGroup falseCommand) {
		super(trueCommand, falseCommand);
	}

	@Override
	public boolean source() {
		return Robot.pn.isArmClosed();
	}

}
