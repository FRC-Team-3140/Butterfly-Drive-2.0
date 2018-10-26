package main.commands.autos;

import interfacesAndAbstracts.ImprovedCommandGroup;
import main.commands.drivetrain.DrivePID;
import main.commands.drivetrain.TimedTurn;

public class LeftToLeftSwitch extends ImprovedCommandGroup {
	
	public LeftToLeftSwitch() {
		addSequential(new DrivePID(148, 3));
		addSequential(new TimedTurn(TurnMode.RIGHT, DT_90_DEG_SEC));
		addSequential(new DrivePID(48, 3));
		 //addSequential(new )
	}

}
