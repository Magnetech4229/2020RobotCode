package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import io.github.pseudoresonance.pixy2api.Pixy2;
import io.github.pseudoresonance.pixy2api.links.SPILink;


public class Pixycam2{

    public static void initialize() {
        
        Pixy2 pixy = Pixy2.createInstance(new SPILink()); // Creates a new Pixy2 camera using SPILink
		pixy.init(1); // Initializes the camera and prepares to send/receive data
        pixy.setLamp((byte) 0, (byte) 0); // Turns the LEDs on
		pixy.setLED(14, 239, 184); // Sets the RGB LED to purple
    }



}