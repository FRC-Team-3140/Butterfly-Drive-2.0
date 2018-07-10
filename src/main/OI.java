/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package main;

import lib.joystick.XboxController;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI implements Constants, HardwareAdapter {
	public OI() {
		check();
	}
	
	public static XboxController getXbox (){
		return xbox;
	}

	public void check(){
		//xbox.leftBumper.whenPressed(new PopUp());
		//xbox.leftBumper.whenReleased(new PopDown());	
		//xbox.leftBumper.whileHeld(new DriveMechanum());
	}
}