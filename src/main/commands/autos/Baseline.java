package main.commands.autos;

import interfacesAndAbstracts.ImprovedCommandGroup;
import main.commands.drivetrain.DrivePID;

public class Baseline extends ImprovedCommandGroup {
	
	public Baseline() {
		addSequential(new DrivePID(144, 4));
	}

}
