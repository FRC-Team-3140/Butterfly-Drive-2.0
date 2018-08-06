package main.commands.popper;

import edu.wpi.first.wpilibj.command.Command;
import main.Constants;
import main.HardwareAdapter;
import main.Robot;

/**
 *
 */
public class TogglePopper extends Command implements Constants, HardwareAdapter {

    public TogglePopper() {
        requires(Robot.pn);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if (Robot.pn.isPopped) {
    		new PopperDown();
    		Robot.pn.isPopped = false;
    	} else {
    		new PopperUp();
    		Robot.pn.isPopped = true;
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
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
