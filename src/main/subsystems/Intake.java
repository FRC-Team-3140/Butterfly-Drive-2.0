package main.subsystems;

import Util.DriveHelper;
import interfacesAndAbstracts.ImprovedSubsystem;
import main.commands.intake.SpinWithJoystick;

public class Intake extends ImprovedSubsystem {
	private DriveHelper helper = new DriveHelper(7.5);

	public Intake() {
	//	armWheelSlave.setInverted(true);
	}
	
	public void intakeWithJoystick(double throttle) {
		armWheelMaster.set(-helper.handleOverPower(helper.handleDeadband(throttle, throttleDeadband)));
		armWheelSlave.set(-helper.handleOverPower(helper.handleDeadband(throttle, throttleDeadband)));
	}
	
	public void spinArmWheels(double throttle) {
		armWheelMaster.set(-throttle);
		armWheelSlave.set(-throttle);
	}
	

	@Override
	public void check() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void zeroSensors() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new SpinWithJoystick());
	}

}
