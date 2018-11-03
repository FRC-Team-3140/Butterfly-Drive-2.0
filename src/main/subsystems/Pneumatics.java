package main.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import main.Constants;
import main.HardwareAdapter;

public class Pneumatics extends Subsystem implements Constants, HardwareAdapter {
	
	public boolean tankMode = true;
	public boolean armClosed = true;
	
	public Pneumatics() {
//		comp.setClosedLoopControl(false);
//		comp.start();
		popper.set(RET);
		popper.set(OFF);
		armPistons.set(RET);
		armPistons.set(OFF);
	}
	
	public void pop(DoubleSolenoid.Value v) {
		if(v == EXT) tankMode = false;
		else if(v == RET) tankMode = true;
		popper.set(v);
	}
	
	public void toggleArm(DoubleSolenoid.Value v) {
		if(v == EXT) {
			armClosed = false;
			System.out.print("ext");
		}
		else if(v == RET) {
			armClosed = true;
			System.out.print("ret");
		}
		
		armPistons.set(v);
	}
	
	public boolean isArmClosed() {
		return armClosed;
	}
	
	public boolean isTankMode() {
		return tankMode;
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(null);
	}
}
