package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.revrobotics.ColorSensorV3;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.I2C.Port;

public class ColorSensor extends Subsystem {
    
    private ColorSensorV3 color;

    public ColorSensor() {

      color = new ColorSensorV3 (Port.kMXP); 
      SmartDashboard.putNumber("Blue", color.getBlue());

   }

   @Override
   protected void initDefaultCommand() {

   }

}