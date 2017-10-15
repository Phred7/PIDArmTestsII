package org.usfirst.frc.team2906.robot.subsystems;

import org.usfirst.frc.team2906.robot.Robot;
import org.usfirst.frc.team2906.robot.RobotMap;
import org.usfirst.frc.team2906.robot.commands.DriveJoys;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

    private final RobotDrive drivePnue21 = RobotMap.drivePnue;

    public void initDefaultCommand() {
       setDefaultCommand(new DriveJoys());
    }
    
    public void arcadeDrive(double move, double rotate){
    	drivePnue21.arcadeDrive(move, rotate);
    }
    
    public void driveStop(){
    	Robot.driveTrain.arcadeDrive(0.0, 0.0);
    }
    
    public void driveWithJoysicks(){
    	Robot.driveTrain.arcadeDrive(Robot.oi.getJoystick1X(), Robot.oi.getJoystick1Y());
    }
}

