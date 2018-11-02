package main.commands.autos;

import interfacesAndAbstracts.ImprovedCommandGroup;
import main.commands.drivetrain.DrivePID;
import main.commands.drivetrain.TimedTurn;

public class CenterToLeftSwitch extends ImprovedCommandGroup{
	
	public CenterToLeftSwitch() {
		addSequential(new DrivePID(40, 2));
		addSequential(new TimedTurn(TurnMode.LEFT, DT_90_DEG_SEC));
		addSequential(new DrivePID(70, 2));
		addSequential(new TimedTurn(TurnMode.RIGHT, DT_90_DEG_SEC));
		addSequential(new DrivePID(100, 2));
	}

}
