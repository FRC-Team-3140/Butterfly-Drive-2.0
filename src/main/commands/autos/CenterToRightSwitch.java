package main.commands.autos;

import interfacesAndAbstracts.ImprovedCommandGroup;
import main.commands.drivetrain.DrivePID;
import main.commands.drivetrain.TimedTurn;

public class CenterToRightSwitch extends ImprovedCommandGroup{
	
	public CenterToRightSwitch() {
		addSequential(new DrivePID(40, 2));
		addSequential(new TimedTurn(TurnMode.LEFT, DT_90_DEG_SEC));
		addSequential(new DrivePID(65, 2));
		addSequential(new TimedTurn(TurnMode.RIGHT, DT_90_DEG_SEC));
		addSequential(new DrivePID(100, 2));
	}
	
	

}
