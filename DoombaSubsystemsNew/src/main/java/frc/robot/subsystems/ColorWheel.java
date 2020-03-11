/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.revrobotics.ColorSensorV3;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Subsystem for the control panel manipulator wheel, uses VictorSPX controllers. 
 * Also should include code for our color sensor.
 */
public class ColorWheel extends Subsystem {

private WPI_VictorSPX wheelMotor;
public static ColorSensorV3 colorSensor;





public ColorWheel(){
  
  wheelMotor = new WPI_VictorSPX(13);
}


  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }


public void spinWheel(double speed) {
  wheelMotor.set(speed);
}

}
