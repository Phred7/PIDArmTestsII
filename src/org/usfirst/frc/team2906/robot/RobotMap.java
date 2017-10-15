package org.usfirst.frc.team2906.robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;
	public static SpeedController armDrive;
	//public static Encoder armCoder;
	public static int distancePerPulse = 250*(20/48);
	public static double sensitivity = 0.05;
	//public static int encoderDegs = (((RobotMap.armCoder.get())*distancePerPulse));
	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	public static void init(){
		
		/*armDrive = new Spark(4);*/
		
		/*armCoder = new Encoder(0, 1, true, Encoder.EncodingType.k4X);
        armCoder.setPIDSourceType(PIDSourceType.kDisplacement);
        armCoder.setDistancePerPulse(distancePerPulse);
        armCoder.reset();*/
        //LiveWindow.addSensor("armCoder", "Encoder", armCoder);
	}
	
	/*public Encoder getarmCoder(){
    	return armCoder;
    }*/
}
