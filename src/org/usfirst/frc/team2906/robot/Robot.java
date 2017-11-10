
package org.usfirst.frc.team2906.robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team2906.robot.commands.EncoderReset;
import org.usfirst.frc.team2906.robot.commands.LowerArm;
import org.usfirst.frc.team2906.robot.commands.AutoNone;
import org.usfirst.frc.team2906.robot.commands.RaiseArm;
import org.usfirst.frc.team2906.robot.subsystems.Arm;
import org.usfirst.frc.team2906.robot.subsystems.DriveTrain;
import org.usfirst.frc.team2906.robot.subsystems.Piston;
import org.usfirst.frc.team2906.robot.subsystems.Vision;
import org.usfirst.frc.team2906.robot.subsystems.Wheels;

public class Robot extends IterativeRobot {

	public static Arm arm;
	public static DriveTrain driveTrain;
	public static Wheels wheels;
	public static Piston piston;
	public static Vision vision;
	public static OI oi;

	Command AutoNone;
	Command autonomousCommand;
	
	
	SendableChooser<Command> chooser = new SendableChooser<>();
	
	final String autoNone = "No Auto";
	
	String[] autoList = {autoNone};
	
	public void robotInit() {
		RobotMap.init();
		
		arm = new Arm("StrongArm");
		driveTrain = new DriveTrain();
		wheels = new Wheels();
		piston = new Piston();
		vision = new Vision();
		oi = new OI(); //ALWAYS GOES LAST!!! get a null error if it doesn't
		
		NetworkTable table = NetworkTable.getTable("SmartDashboard");
		table.putStringArray("Auto List", autoList);
		
		chooser = new SendableChooser();
		chooser.addDefault("No Auto", new AutoNone());
		// chooser.addObject("My Auto", new MyAutoCommand());
		
		SmartDashboard.putData("Auto mode", chooser);
		SmartDashboard.putData("Raise Arm", new RaiseArm());
		SmartDashboard.putData("Lower Arm", new LowerArm());
		SmartDashboard.putData("ENC-RESET", new EncoderReset());
		
	}

	public void disabledInit() {
	}

	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}
	
	public void autonomousInit() {
		autonomousCommand = (Command) chooser.getSelected();

		if (autonomousCommand != null)
				autonomousCommand.start();
	}

	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		
	}

	
	public void teleopInit() {
		if (autonomousCommand != null)
			autonomousCommand.cancel();
		
	}

	public void teleopPeriodic() {
		Scheduler.getInstance().run();

	}

	public void testPeriodic() {
		LiveWindow.run();
		
	}
}
