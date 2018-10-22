package Util;

public class EncoderHelper {
	public int ticksPerRev = 4096;
	
	// Converts inches to encoder revolutions.
	// Inches is what you desire to convert. Circum is the circumference of the spindle that is moving
	public double inchesToRevs(double inches, double circum) {
		return inches / circum;
	}
	
	// Converts inches to # of encoder ticks
	// Inches is what you need to convert. Circum is circumference of spindle. TicksPerRev is native units per
	// revolution of the encoder.
	public int inchesToEncoderTicks(double inches, double circum) {
		return (int) Math.round(inchesToRevs(inches, circum) * ticksPerRev);
	}
	
	// Converts encoder ticks to revolution #.
	// EncoderTicks is what you desire to convert. TicksPerRev is native units per revolution of the encoder
	public double encoderTicksToRevs(double encoderTicks) {
		return encoderTicks / ticksPerRev;
	}
	
	public double encoderTicksToInches(double encoderTicks, double circum) {
		return encoderTicksToRevs(encoderTicks) * circum;
	}
}
