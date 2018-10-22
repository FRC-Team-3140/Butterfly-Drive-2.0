package main.commands.drivetrain;

import interfacesAndAbstracts.ImprovedCommand;
import main.OI;
import main.Robot;

public class DriveMecanum extends ImprovedCommand {
	
    public DriveMecanum() {
        requires(Robot.dt);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.dt.driveMechanum(-OI.getXbox().getSmoothedMainY(), -OI.getXbox().getSmoothedMainX(),
				-OI.getXbox().getSmoothedAltX());
	}

	@Override
	protected boolean isFinished() {
		return true;
	}

}
