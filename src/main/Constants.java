package main;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public interface Constants {
	public static int Xbox_Port = 0;
	public static int Xbox2_Port = 1;
	
	// JOYSTICK DEADBAND'S
	public final double throttleDeadband = 0.1;
	public final double headingDeadband = 0.1;
	public final double strafeDeadband = 0.1;
	
	// TALON SRX'S (CAN BUS)
	public final int LEFT_Drive_Front = 2;
	public final int LEFT_Drive_Rear = 3;
	public final int RIGHT_Drive_Front = 5;
	public final int RIGHT_Drive_Rear = 6;
	
	public final int Arm_Motor_Master = 10;
	public final int Arm_Motor_Slave = 7;
	public final int Arm_Wheels_Master = 8;
	public final int Arm_Wheels_Slave = 9;
	
	// DRIVETRAIN CONSTANTS 
	public final double DT_IN_PER_SEC = 0; //TODO TEST THIS
	public final double DT_90_DEG_SEC = 0;
	public final double DT_WHEEL_DIAM_IN = 4;
	public final double DT_WHEEL_CIRCUM_IN = DT_WHEEL_DIAM_IN * Math.PI;
	public enum TurnMode {
		RIGHT, LEFT
	}
	
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
	
	// PNEUMATIC STATES
	public final DoubleSolenoid.Value EXT = Value.kForward;
	public final DoubleSolenoid.Value RET = Value.kReverse;
	public final DoubleSolenoid.Value OFF = Value.kOff;
	
	// ENCODERS
	public final FeedbackDevice MAG_ENCODER = FeedbackDevice.CTRE_MagEncoder_Relative;
	public final int PID_IDX = 0;
	public final int TOLERANCE_PID_IN = 1;
	
	// TALON BRAKE MODES
	public final boolean BRAKE_MODE = true;
	public final boolean COAST_MODE = false;
	
	// PNEUMATICS (PCM)
	public final int PCM_Port = 1;
	public final int PopperPort_EXT = 4;
	public final int PopperPort_RET = 3;
	public final int ArmPistonPort_EXT = 2;
	public final int ArmPistonPort_RET = 5;
}
