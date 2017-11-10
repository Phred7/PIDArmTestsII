package org.usfirst.frc.team2906.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class RaiseArm extends CommandGroup {

    public RaiseArm() {
        addParallel(new SetArmSetpoint(175.0));
    }
}
