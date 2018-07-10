package main;

import com.ctre.phoenix.motorcontrol.ControlMode;

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
	
	// DEFAULT TALON MODES
	public final ControlMode DEFAULT_CTRL_MODE = ControlMode.PercentOutput;
	public final boolean DEFAULT_BRAKE_MODE = true;
	
	// TALON CONTROL MODES
	public final ControlMode VELOCITY = ControlMode.Velocity;
	public final ControlMode PERCENT_VBUS_MODE = ControlMode.PercentOutput;
	public final ControlMode POSITION = ControlMode.Position;
	public final ControlMode VOLTAGE_MODE = ControlMode.Current;
	public final ControlMode SLAVE_MODE = ControlMode.Follower;
	public final ControlMode DISABLED = ControlMode.Disabled;
	
	// TALON BRAKE MODES
	public final boolean BRAKE_MODE = true;
	public final boolean COAST_MODE = false;
	
	// PNEUMATICS (PCM)
	public final int PCM_Port = 1;
	public final int Popper_Port = 2;
}
