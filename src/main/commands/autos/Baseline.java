package main.commands.autos;

import interfacesAndAbstracts.ImprovedCommandGroup;
import main.commands.drivetrain.DrivePID;
import main.commands.drivetrain.TimedDrive;

public class Baseline extends ImprovedCommandGroup {
	
	public Baseline() {
		addSequential(new TimedDrive(3));
	}

}
