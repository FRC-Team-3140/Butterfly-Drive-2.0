package main;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import lib.joystick.XboxController;

public interface HardwareAdapter extends Constants {
	public static XboxController xbox = new XboxController(Xbox_Port);
	public static XboxController xbox2 = new XboxController(Xbox2_Port);
	
	public static WPI_TalonSRX rearLeftDrive = new WPI_TalonSRX(LEFT_Drive_Rear);
	public static WPI_TalonSRX frontLeftDrive = new WPI_TalonSRX(LEFT_Drive_Front);
	public static WPI_TalonSRX rearRightDrive = new WPI_TalonSRX(RIGHT_Drive_Rear);
	public static WPI_TalonSRX frontRightDrive = new WPI_TalonSRX(RIGHT_Drive_Front);
	
	public static WPI_TalonSRX armMotorMaster = new WPI_TalonSRX(Arm_Motor_Master);
	public static WPI_TalonSRX armMotorSlave = new WPI_TalonSRX(Arm_Motor_Slave);
	
	public static WPI_TalonSRX armWheelMaster = new WPI_TalonSRX(Arm_Wheels_Master);
	public static WPI_TalonSRX armWheelSlave = new WPI_TalonSRX(Arm_Wheels_Slave);
	
	public static Encoder rLeftEnc = new Encoder(0,1, false, Encoder.EncodingType.k4X);
	public static Encoder rRightEnc = new Encoder(2,3, false, Encoder.EncodingType.k4X);
	public static Encoder fLeftEnc = new Encoder(4,5, false, Encoder.EncodingType.k4X);
	public static Encoder fRightEnc = new Encoder(6,7, false, Encoder.EncodingType.k4X);
	
	//Pneumatics
	public static Compressor comp = new Compressor(PCM_Port);
//	public static DoubleSolenoid armPistons = new DoubleSolenoid(PCM_Port, ArmPistonPort_EXT, ArmPistonPort_RET);
//	public static DoubleSolenoid popper = new DoubleSolenoid(PCM_Port, PopperPort_EXT, PopperPort_RET);
}
