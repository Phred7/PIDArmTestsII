package org.usfirst.frc.team2906.robot.subsystems;

import org.usfirst.frc.team2906.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Vision extends Subsystem {

    Relay LEDControl;

    public void initDefaultCommand() {
    	LEDControl = RobotMap.leds;
    	LEDControl.set(Value.kOff);
    }
    
    public void on(){
    	LEDControl.set(Value.kOn);
    }
    
    public void off(){
    	LEDControl.set(Value.kOff);
    }
}

