package org.usfirst.frc.team2906.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class RobotMap {

	//private static final boolean True = false;
	public static RobotDrive drivePnue;
	public static Compressor pnueComp;
	public static DoubleSolenoid ballFire;
	public static SpeedController driveRight;
	public static SpeedController driveLeft;
	public static SpeedController wRight;
	public static SpeedController wLeft;
	public static double sensitivity = 0.15;
	public static double calculatedDriveGearRatio = ((50/14)*(48/16));
	public static double outputDriveGearRatio = (10.71/1);
	private static final boolean Inverted = true;
	
	
	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	public static void init(){
		int green = 0;
    	int orange = 1;
    	int black = 2;
    	int red = 3;
    	//int silver = 4; DO NOT USE (ARM)
    	int silver2 = 5;
    	
    	driveRight = new Talon(green);
    	driveLeft = new Talon(orange);
    	wRight = new Talon(red);
    	wLeft = new Talon(black);
    	wRight.setInverted(Inverted);
    	
    	ballFire = new DoubleSolenoid(1, 2);
    	
    	drivePnue = new RobotDrive(driveLeft, driveRight);
        drivePnue.setSafetyEnabled(false);
        drivePnue.setExpiration(0.1);
        drivePnue.setSensitivity(0.15);
        drivePnue.setMaxOutput(1);
        drivePnue.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        
        pnueComp  = new Compressor(0);
    	
    	 SmartDashboard.putNumber("calculatedDriveGearRatio", calculatedDriveGearRatio);
         SmartDashboard.putNumber("DriveGearRatio", outputDriveGearRatio);
         LiveWindow.addActuator("Drive Train", "Right", (Talon) driveRight);
         LiveWindow.addActuator("Drive Train", "Left", (Talon) driveLeft);
         LiveWindow.addActuator("Wheels", "Right", (Talon) wRight);
         LiveWindow.addActuator("Wheels", "Left", (Talon) wLeft);
         LiveWindow.addActuator("Piston", "Double Solenoid 1", ballFire);
         

	}
}
