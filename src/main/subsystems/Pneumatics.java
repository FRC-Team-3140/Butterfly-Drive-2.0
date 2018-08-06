package main.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import main.Constants;
import main.HardwareAdapter;

public class Pneumatics extends Subsystem implements Constants, HardwareAdapter {
	
	public boolean isPopped = false;
	
	public Pneumatics() {
		comp.setClosedLoopControl(true);
		comp.start();
	}
	
	public void popUp() {
		popper.set(EXT);
		isPopped = true;
	}
	public void popDown() {
		popper.set(RET);
		isPopped = false;
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(null);
	}
}
