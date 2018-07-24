package main.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import main.Constants;
import main.HardwareAdapter;
import main.commands.arm.MoveArm;

public class Arm extends Subsystem implements Constants, HardwareAdapter {
	
	public boolean isArmOpen = false;
	
	public Arm() {
		armMotorSlave.follow(armMotorMaster);
		armMotorSlave.setInverted(true);
		CloseArm();
	}
	
	public void MoveArmWithJoyStick(double throttle) {
		armMotorMaster.set(throttle);
	}
	
	public void OpenArm() {
		armPistons.set(RET);
		isArmOpen = true;
	}
	public void CloseArm() {
		armPistons.set(EXT);
		isArmOpen = false;
	}
	
    public void initDefaultCommand() {
        setDefaultCommand(new MoveArm());
    }
}
