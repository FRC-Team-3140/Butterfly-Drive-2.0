package main.commands.arm;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import interfacesAndAbstracts.ImprovedCommand;
import main.Robot;

public class Arm extends ImprovedCommand {
	DoubleSolenoid.Value v;
	
	public Arm(DoubleSolenoid.Value v) {
		this.v = v;
		requires(Robot.pn);
	}
	
	protected void execute() {
		Robot.pn.toggleArm(v);
	}

	@Override
	protected boolean isFinished() {
		return true;
	}
	
}
