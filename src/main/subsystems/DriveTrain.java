package main.subsystems;

import Util.DriveHelper;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.Vector2d;
import main.Constants;
import main.HardwareAdapter;
import main.commands.drivetrain.Drive;
import main.commands.drivetrain.DriveTank;

public class DriveTrain extends Subsystem implements Constants, HardwareAdapter {
	
	private DriveHelper helper = new DriveHelper(7.5);
	public boolean isDrivingTank = true;
	
	public DriveTrain() {
		frontLeftDrive.setInverted(false);
		rearRightDrive.setInverted(false);	
	}
	
	public void driveMechanum(double throttle, double heading, double strafe) {
		driveCartesian(helper.handleOverPower(helper.handleDeadband(strafe, strafeDeadband)), 
				helper.handleOverPower(helper.handleDeadband(throttle, throttleDeadband)),
				helper.handleOverPower(helper.handleDeadband(heading, headingDeadband)));
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
	
	public void driveCartesian(double strafe, double throttle, double heading) {
		Vector2d input = new Vector2d(strafe, throttle);
		input.rotate(0);

		double[] wheelSpeeds = new double[4];
	    wheelSpeeds[0] = input.x + input.y + heading;
	    wheelSpeeds[1] = input.x - input.y + heading;
	    wheelSpeeds[2] = -input.x + input.y + heading;
	    wheelSpeeds[3] = -input.x - input.y + heading;

	    frontLeftDrive.set(wheelSpeeds[0]);
	    frontRightDrive.set(wheelSpeeds[1]);
	    rearLeftDrive.set(wheelSpeeds[2]);
	    rearRightDrive.set(wheelSpeeds[3]);
	}
	
    public void initDefaultCommand() {
        setDefaultCommand(new Drive());
    }
}
