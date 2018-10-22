package main.subsystems;

import Util.DriveHelper;
import edu.wpi.first.wpilibj.command.Subsystem;
import main.Constants;
import main.HardwareAdapter;
import main.commands.arm.MoveArm;

public class Arm extends Subsystem implements Constants, HardwareAdapter {
	
	public boolean isArmOpen = false;
	private DriveHelper helper = new DriveHelper(7.5);
	
	public Arm() {
	}
	
	public void moveArmWithJoyStick(double throttle) {
		armMotorMaster.set(helper.handleOverPower(helper.handleDeadband(throttle, throttleDeadband)));
		armMotorSlave.set(helper.handleOverPower(helper.handleDeadband(throttle, throttleDeadband)));
	}

	public void moveArm(double throttle) {
		armMotorMaster.set(throttle);
		armMotorSlave.set(throttle);
	}

    public void initDefaultCommand() {
        setDefaultCommand(new MoveArm());
    }
}
