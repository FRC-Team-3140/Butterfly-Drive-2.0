package main.commands.popper;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
import main.Constants;
import main.HardwareAdapter;
import main.Robot;

/**
 *
 */
public class Popper extends Command implements Constants, HardwareAdapter{
	public DoubleSolenoid.Value v;
	
    public Popper(DoubleSolenoid.Value v) {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.pn);
        this.v = v;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	popper.set(v);
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
