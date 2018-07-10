package main;

public interface Constants {
	public static int Xbox_Port = 0;
	
	// JOYSTICK DEADBAND'S
	public final double throttleDeadband = 0.02;
	public final double headingDeadband = 0.02;
	public final double strafeDeadband = 0.02;
	
	// TALON SRX'S (CAN BUS)
	public final int LEFT_Drive_Front = 2;
	public final int LEFT_Drive_Rear = 3;
	public final int RIGHT_Drive_Front = 5;
	public final int RIGHT_Drive_Rear = 6;
	public final int Arm_Motor_Master = 1;
	public final int Arm_Motor_Slave = 7;
}
