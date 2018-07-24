package main.commands.arm;

import edu.wpi.first.wpilibj.command.Command;
import main.OI;
import main.Robot;

public class MoveArm extends Command {
	   public MoveArm() {
	    	requires(Robot.arm);
	    }

	    // Called just before this Command runs the first time
	    protected void initialize() {
	    }

	    // Called repeatedly when this Command is scheduled to run
	    protected void execute() {
	    	Robot.arm.MoveArmWithJoyStick(OI.getXbox2().getSmoothedMainY());
	    	Robot.arm.SpinArmWheels(OI.getXbox2().getSmoothedAltY());
	    }
	    // Make this return true when this Command no longer needs to run execute()
	    protected boolean isFinished() {
	        return true;
	    }

	    // Called once after isFinished returns true
	    protected void end() {
	    }

	    // Called when another command which requires one or more of the same
	    // subsystems is scheduled to run
	    protected void interrupted() {
	    }
}
