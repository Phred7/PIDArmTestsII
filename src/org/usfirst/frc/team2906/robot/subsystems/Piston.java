package org.usfirst.frc.team2906.robot.subsystems;

import org.usfirst.frc.team2906.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Piston extends Subsystem {

    DoubleSolenoid fire;

    public void initDefaultCommand() {
        
    	fire = RobotMap.ballFire;
    }
    
    public void bReset(){
    	fire.set(Value.kForward);
    }
    
    public void bFire(){
    	fire.set(Value.kReverse);    	
    }
    
    public void bOff(){
    	fire.set(Value.kOff);
    }
}

