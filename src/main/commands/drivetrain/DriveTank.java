package main.commands.drivetrain;

import edu.wpi.first.wpilibj.command.Command;
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

	protected boolean isFinished() {
		return true;
	}

}
 