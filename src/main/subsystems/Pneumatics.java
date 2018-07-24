package main.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import main.Constants;
import main.HardwareAdapter;

public class Pneumatics extends Subsystem implements Constants, HardwareAdapter {
	public Pneumatics() {
		comp.setClosedLoopControl(true);
	}
	
	public void pop(DoubleSolenoid.Value v) {
		popper.set(v);
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(null);
	}
}
