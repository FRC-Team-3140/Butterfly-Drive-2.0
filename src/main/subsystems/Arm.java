package main.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import main.Constants;
import main.HardwareAdapter;
import main.commands.arm.MoveArm;

public class Arm extends Subsystem implements Constants, HardwareAdapter {
	
	public Arm() {
		armMotorSlave.follow(armMotorMaster);
		armMotorSlave.setInverted(true);
	}
	
	public void MoveArmWithJoyStick(double throttle) {
		armMotorMaster.set(throttle);
	}
	
	public void OpenArm() {
		armPistons.set(RET);
	}
	public void CloseArm() {
		armPistons.set(EXT);
	}
	
    public void initDefaultCommand() {
        setDefaultCommand(new MoveArm());
    }
}
