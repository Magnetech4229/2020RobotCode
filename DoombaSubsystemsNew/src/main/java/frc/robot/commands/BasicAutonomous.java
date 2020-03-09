/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;

public class BasicAutonomous extends CommandGroup {
  /**
   * Command group for basic autonomous.
   *  Drives forward at half-power for two seconds, revs the shooter for 3 seconds, then shoots for 5 seconds.
   */
  public BasicAutonomous() {
    // Add Commands here:
    // e.g. addSequential(new Command1());
    // addSequential(new Command2());
    // these will run in order.

    addSequential(new AutoDriveTimed(1));

    addSequential(new AutoShooterTimed(3));
    

    addParallel(new AutoShooterTimed(5));
    addSequential(new AutoHopperTimed(5));
    addSequential(new AutoWinchTimed(1.7));

    

    // To run multiple commands at the same time,
    // use addParallel()
    // e.g. addParallel(new Command1());
    // addSequential(new Command2());
    // Command1 and Command2 will run in parallel.

    // A command group will require all of the subsystems that each member
    // would require.
    // e.g. if Command1 requires chassis, and Command2 requires arm,
    // a CommandGroup containing them would require both the chassis and the
    // arm.
  }
}
