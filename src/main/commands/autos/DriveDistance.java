package main.commands.autos;

import edu.wpi.first.wpilibj.command.Command;
import main.Robot;

/**
 *
 */
public class DriveDistance extends Command {

	double distance;
	double speed;
	
    public DriveDistance(double distance, double speed) {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.dt);
        this.distance = distance;
        this.speed = speed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.dt.resetEncoders();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Robot.dt.getDistanceTravelled() < distance) {
    		Robot.dt.arcadeDrive(speed, 0);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
