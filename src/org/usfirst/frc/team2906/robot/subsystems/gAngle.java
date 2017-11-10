package org.usfirst.frc.team2906.robot.subsystems;

import org.usfirst.frc.team2906.robot.RobotMap;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class gAngle extends Subsystem {

	ADXRS450_Gyro Agyro = RobotMap.gyro;

    public void initDefaultCommand() {
    	double angle = Agyro.getAngle();
    	SmartDashboard.putNumber("Gyro angle", angle);
    }
}

