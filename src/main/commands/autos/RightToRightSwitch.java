package main.commands.autos;

import interfacesAndAbstracts.ImprovedCommandGroup;
import main.commands.drivetrain.DrivePID;
import main.commands.drivetrain.TimedTurn;

public class RightToRightSwitch extends ImprovedCommandGroup {
	
	public RightToRightSwitch() {
		addSequential(new DrivePID(148, 3));
		addSequential(new TimedTurn(TurnMode.LEFT, DT_90_DEG_SEC));
		addSequential(new DrivePID(48, 3));
	}

}