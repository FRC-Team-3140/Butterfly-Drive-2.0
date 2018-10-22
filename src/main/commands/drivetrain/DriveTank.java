package main.commands.drivetrain;

import interfacesAndAbstracts.ImprovedCommand;
import main.OI;
import main.Robot;

public class DriveTank extends ImprovedCommand {
	
	public DriveTank() {
		requires(Robot.dt);
	}
	
	protected void execute() {
		Robot.dt.arcadeDrive(-OI.getXbox().getSmoothedMainY(), -OI.getXbox().getSmoothedAltX());
	}

	@Override
	protected boolean isFinished() {
		return true;
	}

}
 