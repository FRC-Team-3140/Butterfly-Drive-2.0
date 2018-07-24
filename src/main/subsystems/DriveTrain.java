package main.subsystems;

import Util.DriveHelper;
import edu.wpi.first.wpilibj.command.Subsystem;
import main.Constants;
import main.HardwareAdapter;
import main.commands.drivetrain.DriveTank;

public class DriveTrain extends Subsystem implements Constants, HardwareAdapter {
	private DriveHelper helper = new DriveHelper(7.5);
	public DriveTrain() {
		frontLeftDrive.setInverted(false);
		rearRightDrive.setInverted(false);	
	}
	
	public void arcadeDrive(double throttle, double heading) {
		throttle = helper.handleOverPower(helper.handleDeadband(throttle, throttleDeadband));
		heading = helper.handleOverPower(helper.handleDeadband(heading, headingDeadband));
		tankDrive(throttle + heading, throttle - heading);
	}
	
	public void tankDrive(double leftThrottle, double rightThrottle) {
		frontLeftDrive.set(leftThrottle);
		rearLeftDrive.set(-leftThrottle);
		frontRightDrive.set(rightThrottle);
		rearRightDrive.set(-rightThrottle);
	}
	
    public void initDefaultCommand() {
        setDefaultCommand(new DriveTank());
    }
}
