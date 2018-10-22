package main.commands.intake;

import interfacesAndAbstracts.ImprovedCommand;
import main.OI;
import main.Robot;

public class SpinWithJoystick extends ImprovedCommand {
	
	public SpinWithJoystick() {
		requires(Robot.in);
	}

	protected void execute() {
    	Robot.in.intakeWithJoystick(-OI.getXbox2().getSmoothedAltY());

	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}

}
