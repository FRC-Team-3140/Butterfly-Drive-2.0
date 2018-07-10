package main;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Compressor;
import lib.joystick.XboxController;

public interface HardwareAdapter extends Constants {
	public static XboxController xbox = new XboxController(Xbox_Port);
	
	public static WPI_TalonSRX rearLeftDrive = new WPI_TalonSRX(LEFT_Drive_Rear);
	public static WPI_TalonSRX frontLeftDrive = new WPI_TalonSRX(LEFT_Drive_Front);
	public static WPI_TalonSRX rearRightDrive = new WPI_TalonSRX(RIGHT_Drive_Rear);
	public static WPI_TalonSRX frontRightDrive = new WPI_TalonSRX(RIGHT_Drive_Front);
	
	public static WPI_TalonSRX armMotorMaster = new WPI_TalonSRX(Arm_Motor_Master);
	public static WPI_TalonSRX armMotorSlave = new WPI_TalonSRX(Arm_Motor_Slave);
	
	public static Compressor comp = new Compressor(PCM_Port);
}
