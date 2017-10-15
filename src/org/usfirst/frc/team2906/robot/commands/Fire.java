package org.usfirst.frc.team2906.robot.commands;

import org.usfirst.frc.team2906.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Fire extends Command {

    public Fire() {
        requires(Robot.piston);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.piston.bFire();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
