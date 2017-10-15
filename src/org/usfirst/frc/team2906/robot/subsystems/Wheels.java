package org.usfirst.frc.team2906.robot.subsystems;

import org.usfirst.frc.team2906.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Wheels extends Subsystem {

    SpeedController right = RobotMap.wRight;
    SpeedController left = RobotMap.wLeft;
    public static double sOut = -1.0;
    public static double sIn = 1.0;
    public static double sStop = 0.0;

    public void initDefaultCommand() {

    }
    
    public void ballOut(){
    	right.set(sOut);
    	left.set(sOut);
    }
    
    public void ballIn(){
    	right.set(sIn);
    	left.set(sIn);
    }
    
    public void ballStop(){
    	right.set(sStop);
    	left.set(sStop);
    }
}

