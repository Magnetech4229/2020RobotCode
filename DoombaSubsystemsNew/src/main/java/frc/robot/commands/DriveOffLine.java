
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.WaitCommand;
import edu.wpi.first.wpilibj.command.WaitUntilCommand;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.Timer;


public class DriveOffLine extends Command {

    Timer timer;

     // Called just before this Command runs the first time
    /**
     * 
     */
    @Override
    protected void initialize() { 
        Robot.driveTrain.drive(0, 0);
        timer = new Timer();
        timer.start();



    
    }


    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {

        while (timer.get() <= 1){

            Robot.driveTrain.drive(.5,.5);

        }

        timer.reset();

        while (timer.get() <= 4.5){

            Robot.launcher.spinLauncher(-1);
            if (timer.get() > 3){

                Robot.powerCellStorage.spinStorage(0.5);
            }

        timer.reset();

        while (timer.get() <= 2) {

            Robot.driveTrain.drive(.5, .5);

        }

        timer.reset();

        

            

        }
       


    }


    @Override
    protected boolean isFinished() {
       return timer.hasPeriodPassed(10);
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
