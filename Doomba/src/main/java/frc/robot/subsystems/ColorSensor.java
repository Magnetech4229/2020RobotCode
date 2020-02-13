package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
//import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.ColorTest;

import com.revrobotics.ColorSensorV3;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.I2C.Port;

public class ColorSensor extends Subsystem {

    private ColorSensorV3 color;

    public ColorSensor() {
      color = new ColorSensorV3(Port.kOnboard);
      //SmartDashboard.putString("say","different");

   }

   @Override
   protected void initDefaultCommand() {
      setDefaultCommand(new ColorTest());
   }

   public int readBlue() {
      color.getColor();
      //SmartDashboard.putString("Write", "readBlue");
      return color.getBlue();
   }
}