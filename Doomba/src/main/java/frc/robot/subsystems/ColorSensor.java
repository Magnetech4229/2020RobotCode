package frc.robot.subsystems;

import com.revrobotics.ColorSensorV3;

import edu.wpi.first.wpilibj.I2C.Port;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.*;

public class ColorSensor extends Subsystem{

    private ColorSensorV3 rgbSensor;

    public ColorSensor() {
        rgbSensor = new ColorSensorV3(Port.kOnboard);
    }

    @Override
    protected void initDefaultCommand() {
        // TODO Auto-generated method stub

    }
    
}