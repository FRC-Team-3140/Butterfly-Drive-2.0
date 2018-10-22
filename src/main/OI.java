/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package main;

import lib.joystick.XboxController;
import main.commands.arm.CloseArm;
import main.commands.arm.OpenArm;
import main.commands.arm.SwitchArm;
import main.commands.drivetrain.DriveMecanum;
import main.commands.drivetrain.DriveTank;
import main.commands.drivetrain.SwitchDrive;
import main.commands.popper.PopperDown;
import main.commands.popper.PopperUp;
import main.commands.popper.SwitchPopper;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI implements Constants, HardwareAdapter {
	public OI() {
		xbox.leftBumper.whenPressed(new SwitchPopper(new PopperUp(), new PopperDown()));
		xbox2.rightBumper.whenPressed(new SwitchArm(new CloseArm(), new OpenArm()));
		xbox.leftBumper.whenPressed(new SwitchDrive(new DriveTank(), new DriveMecanum()));
	}
	
	public static XboxController getXbox (){
		return xbox;
	}
	public static XboxController getXbox2() {
		return xbox2;
	}

	public void check(){
		xbox.check();
		xbox2.check();
	}
}