package main.commands.popper;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
import main.Constants;
import main.Robot;

public class Pop extends Command implements Constants{
	private DoubleSolenoid.Value v;
	
    public Pop(DoubleSolenoid.Value v) {
    	requires(Robot.pn);
    	this.v = v;
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.pn.pop(v);
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
