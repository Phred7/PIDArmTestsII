package org.usfirst.frc.team2906.robot;

import org.usfirst.frc.team2906.robot.commands.BallIn;
import org.usfirst.frc.team2906.robot.commands.BallOut;
import org.usfirst.frc.team2906.robot.commands.BallStop;
import org.usfirst.frc.team2906.robot.commands.Fire;
import org.usfirst.frc.team2906.robot.commands.LowerArm;
import org.usfirst.frc.team2906.robot.commands.RaiseArm;
import org.usfirst.frc.team2906.robot.commands.Reload;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {

	public Joystick joystick1;
	public Joystick joystick2;

	public JoystickButton trigr1;
	public JoystickButton thumb;
	public JoystickButton j1b5;
	public JoystickButton j1b6;

	public JoystickButton trigr2;
	public JoystickButton j2b3;
	public JoystickButton j2b4;
	public JoystickButton squr11;
	public JoystickButton squr12;

	public OI() {
		joystick1 = new Joystick(0);
		joystick2 = new Joystick(1);
		// Joystick 1 Buttons
		trigr1 = new JoystickButton(joystick1, 1);
		trigr1.whenPressed(new RaiseArm());

		thumb = new JoystickButton(joystick1, 2);
		thumb.whenPressed(new LowerArm());

		j1b5 = new JoystickButton(joystick1, 5);
		j1b5.whileHeld(new BallIn());
		j1b5.whenReleased(new BallStop());

		j1b6 = new JoystickButton(joystick1, 6);
		j1b6.whileHeld(new BallOut());
		j1b6.whenReleased(new BallStop());
		// Joystick 2 Buttons
		trigr2 = new JoystickButton(joystick2, 1);
		trigr2.whileHeld(new Fire());
		trigr2.whenReleased(new Reload());

		j2b3 = new JoystickButton(joystick2, 3);
		j2b3.whileHeld(new BallIn());
		j2b3.whenReleased(new BallStop());

		j2b4 = new JoystickButton(joystick2, 4);
		j2b4.whileHeld(new BallOut());
		j2b4.whenReleased(new BallStop());

		squr11 = new JoystickButton(joystick2, 11);
		squr11.whenPressed(new RaiseArm());

		squr12 = new JoystickButton(joystick2, 12);
		squr12.whenPressed(new LowerArm());

	}

	public Joystick getJoystick1() {
		return joystick1;
	}

	public double getJoystick1X() {
		if (Math.abs(joystick1.getX()) > RobotMap.sensitivity) {
			return -1 * joystick1.getX();
		} else {
			return 0.0;
		}
	}

	public double getJoystick1Y() {
		if (Math.abs(joystick1.getY()) > RobotMap.sensitivity) {
			return -1 * joystick1.getY();
		} else {
			return 0.0;
		}
	}
    
	public Joystick getJoystick2(){
    	return joystick2;
    }
	/*
	 * public double getJoystick1Z() { if (Math.abs(joystick1.getRawAxis(3)) >
	 * RobotMap.sensitivity) { return -1.0 *
	 * (Math.abs(joystick1.getRawAxis(3))); } else { return 0.0; } }
	 */
}
