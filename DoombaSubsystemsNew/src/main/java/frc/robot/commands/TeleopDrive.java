// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package frc.robot.commands;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 * Basic drive code for the robot, uses the drivetrain.drive method defined in the DT subsystem with an xbox. 
 * Drivetrain.drive takes two numbers between -1 and 1. Negative values drive forwards.
 * Also creates encoders and puts them on SmartDashboard.
 */
public class TeleopDrive extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public TeleopDrive() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
        Robot.driveTrain.frontLeftEncoder.setPosition(0);
        Robot.driveTrain.frontRightEncoder.setPosition(0);
        Robot.driveTrain.backLeftEncoder.setPosition(0);
        Robot.driveTrain.backRightEncoder.setPosition(0);
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        Robot.driveTrain.drive(Robot.oi.xbox.getY(Hand.kLeft), Robot.oi.xbox.getY(Hand.kRight));
        //SmartDashboard.putNumber("Encoder Position - FL", Robot.driveTrain.frontLeftEncoder.getPosition());
        //SmartDashboard.putNumber("Speed - FL", Robot.driveTrain.frontLeftController.get());
        //SmartDashboard.putNumber("Encoder Position - FR", -Robot.driveTrain.frontRightEncoder.getPosition());
        //SmartDashboard.putNumber("Speed - FR", Robot.driveTrain.frontRightController.get());
        //SmartDashboard.putNumber("Encoder Position - BL", Robot.driveTrain.backLeftEncoder.getPosition());
        //SmartDashboard.putNumber("Speed - BL", Robot.driveTrain.backLeftController.get());
        //SmartDashboard.putNumber("Encoder Position - BR", -Robot.driveTrain.backRightEncoder.getPosition());
        //SmartDashboard.putNumber("Speed - BR", Robot.driveTrain.backRightController.get());
    }
    

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
        Robot.driveTrain.drive(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
        end();
    }
}
