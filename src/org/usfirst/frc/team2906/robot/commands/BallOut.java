package org.usfirst.frc.team2906.robot.commands;

import org.usfirst.frc.team2906.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class BallOut extends Command {

    public BallOut() {
    	requires(Robot.wheels);
    }
    
    protected void initialize() {
    }

    protected void execute() {
    	Robot.wheels.ballOut();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}

