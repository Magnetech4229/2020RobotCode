package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;

public class ColorTest extends Command{

    public ColorTest() {
        requires(Robot.colorSensor);
    } 
    
            @Override
            protected void initialize() {
            }
        
            @Override
            protected void execute() {
              SmartDashboard.putNumber("Blue", Robot.colorSensor.getBlue());

            }

            // Make this return true when this Command no longer needs to run execute()
            @Override
            protected boolean isFinished() {
                return false;
            }
        
            // Called once after isFinished returns true
            @Override
            protected void end() {
            }
        
            // Called when another command which requires one or more of the same
            // subsystems is scheduled to run
            @Override
            protected void interrupted() {
            }
        }