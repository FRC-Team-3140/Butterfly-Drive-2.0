package main.subsystems;

import Util.DriveHelper;
import Util.EncoderHelper;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.Vector2d;
import main.Constants;
import main.HardwareAdapter;
import main.commands.drivetrain.DriveTank;

public class DriveTrain extends Subsystem implements Constants, HardwareAdapter {
	
	private DriveHelper helper = new DriveHelper(7.5);
	private EncoderHelper encHelp = new EncoderHelper();
	public boolean isDrivingTank = true;
	private double kP = 1; //TODO tune this uwu
	
	public DriveTrain() {
//		frontRightDrive.setInverted(true);
//		rearLeftDrive.setInverted(true);	
		configEncoders();
		configPID();
	}
	
	/*****************
	 * TIMED METHODS *
	 *****************/
	public void turnRight() {
		tankDrive(0.5, -0.5);
	}
	
	public void turnLeft() {
		tankDrive(-0.5, 0.5);
	}
	
	/*******************
	 * ENCODER METHODS *
	 *******************/
	public void configEncoders() {
		rearLeftDrive.configSelectedFeedbackSensor(MAG_ENCODER, PID_IDX, 10);
		rearRightDrive.configSelectedFeedbackSensor(MAG_ENCODER, PID_IDX, 10);
		frontLeftDrive.configSelectedFeedbackSensor(MAG_ENCODER, PID_IDX, 10);
		frontRightDrive.configSelectedFeedbackSensor(MAG_ENCODER, PID_IDX, 10);
		resetEncoders();
	}
	
	public int getDrivetrainTicksTravelled() {
		int sum = rearLeftDrive.getSelectedSensorPosition(PID_IDX)  + rearRightDrive.getSelectedSensorPosition(PID_IDX)
					+ frontLeftDrive.getSelectedSensorPosition(PID_IDX) + frontRightDrive.getSelectedSensorPosition(PID_IDX);
		return sum/4;
	}
	
	public double getDrivetrainInchesTravelled() {
		return encHelp.encoderTicksToInches(getDrivetrainTicksTravelled(), DT_WHEEL_CIRCUM_IN);
	}
	
	public void resetEncoders() {
		rearLeftDrive.setSelectedSensorPosition(0, PID_IDX, 10);
		rearRightDrive.setSelectedSensorPosition(0, PID_IDX, 10);
		frontLeftDrive.setSelectedSensorPosition(0, PID_IDX, 10);
		frontRightDrive.setSelectedSensorPosition(0, PID_IDX, 10);
	}
	
	public boolean isDrivetrainAtDistance(double inches) {
		return Math.abs(getDrivetrainInchesTravelled() - inches) <= TOLERANCE_PID_IN;
	}
	
	/***************
	 * PID METHODS *
	 ***************/
	public void configPID() {
		rearLeftDrive.config_kP(PID_IDX, kP, 10);
		rearRightDrive.config_kP(PID_IDX, kP, 10);
		frontLeftDrive.config_kP(PID_IDX, kP, 10);
		frontRightDrive.config_kP(PID_IDX, kP, 10);
	}
	
	public void drivePID(double inches) {
		double ticks = encHelp.inchesToEncoderTicks(inches, DT_WHEEL_CIRCUM_IN);
		rearLeftDrive.set(POSITION, ticks);
		rearRightDrive.set(POSITION, ticks);
		frontLeftDrive.set(POSITION, ticks);
		frontRightDrive.set(POSITION, ticks);
	}
	
	/******************
	 * TELEOP METHODS *
	 ******************/
	public void driveMechanum(double throttle, double heading, double strafe) {
		driveCartesian(helper.handleOverPower(helper.handleDeadband(strafe, strafeDeadband)), 
				helper.handleOverPower(helper.handleDeadband(throttle, throttleDeadband)),
				helper.handleOverPower(helper.handleDeadband(heading, headingDeadband)));
		System.out.println("driving mecanum!!");
		isDrivingTank = false;
	}
	
	public void arcadeDrive(double throttle, double heading) {
		throttle = helper.handleOverPower(helper.handleDeadband(throttle, throttleDeadband));
		heading = helper.handleOverPower(helper.handleDeadband(heading, headingDeadband));
		tankDrive(throttle + heading, throttle - heading);
		isDrivingTank = true;
	}
	
	/*****************
	 * BASIC DRIVING *
	 *****************/
	public void tankDrive(double leftThrottle, double rightThrottle) {
		frontLeftDrive.set(leftThrottle);
		rearLeftDrive.set(leftThrottle);
		frontRightDrive.set(-rightThrottle);
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
        setDefaultCommand(new DriveTank());
    }
}
