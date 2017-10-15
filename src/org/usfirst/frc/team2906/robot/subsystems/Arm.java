package org.usfirst.frc.team2906.robot.subsystems;

import org.usfirst.frc.team2906.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 *
 */
public class Arm extends PIDSubsystem {

	private final Spark motor;
	private final Encoder enc;
	private String name;
	
    public Arm(String name) {
    	super(name, 0.02, 0.000039, 0.0175, 0.0);
    	this.name = name;
    	motor = new Spark(4);
    	enc = new Encoder(0, 1);
        enc.setPIDSourceType(PIDSourceType.kDisplacement);
        enc.setDistancePerPulse(100);
    	setAbsoluteTolerance(0.5);
    	getPIDController().setContinuous(false);
    	getPIDController().setSetpoint(0.0);
    	getPIDController().enable();
    	LiveWindow.addActuator(this.name, "motor", motor);
		LiveWindow.addSensor(this.name, "enc", enc);
		LiveWindow.addActuator(this.name, "PIDSubsystem Controller", getPIDController());
		
    }

    public void initDefaultCommand() {
	}

	@Override
	public boolean onTarget() {
		double e = Math.abs(getPIDController().getError());
		System.out.println(name + ", " + e);
		return e < .15;
	}

	protected double returnPIDInput() {
		return enc.get();
	}

	protected void usePIDOutput(double output) {
		if (!Double.isNaN(output)) {
			motor.pidWrite(output);
		}
	}
	
	public void stop(){
		motor.set(0);
	}
	
	public boolean isReset(){
		return enc.get()<= 15;
	}

	public void reset() {
		enc.reset();
	}
}