package main.commands.drivetrain;

import edu.wpi.first.wpilibj.command.TimedCommand;
import interfacesAndAbstracts.ImprovedCommand;
import main.Robot;
import main.Constants.TurnMode;

public class TimedTurn extends TimedCommand {
	
	private TurnMode mode;

	public TimedTurn(TurnMode mode, double timeout) {
		super(timeout);
		requires(Robot.dt);
		this.mode = mode;
	}
	
	public void execute() {
		if(mode == TurnMode.LEFT) {
			Robot.dt.turnLeft();
		}
		else Robot.dt.turnRight();
	}

}
