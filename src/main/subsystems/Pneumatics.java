package main.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import main.Constants;
import main.HardwareAdapter;

public class Pneumatics extends Subsystem implements Constants, HardwareAdapter {
	public Pneumatics() {
		comp.setClosedLoopControl(true);
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(null);
	}
}
