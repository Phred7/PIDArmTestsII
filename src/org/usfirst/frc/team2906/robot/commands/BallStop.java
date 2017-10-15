package org.usfirst.frc.team2906.robot.commands;

import org.usfirst.frc.team2906.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class BallStop extends Command {

    public BallStop() {
    	requires(Robot.wheels);
    }
    
    protected void initialize() {
    }

    protected void execute() {
    	Robot.wheels.ballStop();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}

