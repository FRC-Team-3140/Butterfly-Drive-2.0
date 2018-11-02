package main.commands.drivetrain;

import edu.wpi.first.wpilibj.command.TimedCommand;
import main.Robot;

public class DrivePID extends TimedCommand {
	double inches;
	
	public DrivePID(double inches, double timeout) {
		super(timeout);
		requires(Robot.dt);
		this.inches = inches;
	}
	
	public void initialize() {
		Robot.dt.resetEncoders();
	}
	
	public void execute() {
		Robot.dt.drivePID(inches);
	}

	@Override
	protected boolean isFinished() {
		return Robot.dt.isDrivetrainAtDistance(inches) || isTimedOut();
	}

}
