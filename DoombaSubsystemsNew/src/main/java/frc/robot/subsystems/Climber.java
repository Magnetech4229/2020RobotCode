/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import frc.robot.commands.*;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Climber extends Subsystem {
private WPI_VictorSPX hookLiftMotor;
private WPI_VictorSPX winchLeftMotor;
private WPI_VictorSPX winchRightMotor;


  public Climber(){
    hookLiftMotor = new WPI_VictorSPX(12);
    winchLeftMotor = new WPI_VictorSPX(10);
    winchRightMotor = new WPI_VictorSPX(11);

  }


  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new ClimbRobotPos());
  }
  public void liftClimber(double speed){
    hookLiftMotor.set(speed);
  }

  public void liftRobot(double speed){
    winchLeftMotor.set(speed);
    winchRightMotor.set(speed);
  }

}
