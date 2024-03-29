// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package frc.robot;

import frc.robot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.*;
import frc.robot.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
public JoystickButton wheelButton1;
public JoystickButton intakeButton3;
public JoystickButton intakeButton4;
public JoystickButton launchButton5;
public JoystickButton intakeButton6;
public JoystickButton storageButton7;
public JoystickButton launchButton8;
public JoystickButton intakeButton9;
public JoystickButton storageButton10;
public JoystickButton rotationControl2;

public JoystickButton xboxButtonA;
public JoystickButton xboxButtonB;
public JoystickButton xboxButtonX;
public JoystickButton xboxButtonY;


public Joystick leftJoystick;
public Joystick rightJoystick;

public XboxController xbox;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

//rightJoystick = new Joystick(1);

leftJoystick = new Joystick(0);
xbox = new XboxController(1);

//Button 10, runs our hopper upwards
storageButton10 = new JoystickButton(leftJoystick, 10);
storageButton10.whileHeld(new StorageNegativeSpin());

//Button 9, runs our intake inwards
intakeButton9 = new JoystickButton(leftJoystick, 9);
intakeButton9.toggleWhenPressed(new IntakeNegativeSpin());

//Button 8, runs our launcher forwards
launchButton8 = new JoystickButton(leftJoystick, 8);
launchButton8.whileHeld(new LauncherNegativeSpin());

//Button 7, runs our hopper downwards
storageButton7 = new JoystickButton(leftJoystick, 7);
storageButton7.whileHeld(new StoragePositiveSpin());

//Button 6, runs our intake outwards
intakeButton6 = new JoystickButton(leftJoystick, 6);
intakeButton6.whileHeld(new IntakePositiveSpin());

//Button 5, runs our launcher backwards
launchButton5 = new JoystickButton(leftJoystick, 5);
launchButton5.whileHeld(new LauncherPositiveSpin());

//Button 4, pulls our intake up
intakeButton4 = new JoystickButton(leftJoystick, 4);
intakeButton4.whileHeld(new IntakeMoveNeg());

//Button 3, lets our intake down
intakeButton3 = new JoystickButton(leftJoystick, 3);
intakeButton3.whileHeld(new IntakeMovePos());

rotationControl2 = new JoystickButton(leftJoystick, 2);
rotationControl2.whenPressed(new RotationControl(7.45));

//Button 1, spins our control panel wheel
wheelButton1 = new JoystickButton(leftJoystick, 1);
wheelButton1.whileHeld(new ColorWheelSpin());





        // SmartDashboard Buttons
        //SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        //SmartDashboard.putData("TeleopDrive", new TeleopDrive());
        //SmartDashboard.putData("IntakePositiveSpin", new IntakePositiveSpin());
        //SmartDashboard.putData("IntakeNegativeSpin", new IntakeNegativeSpin());
        //SmartDashboard.putData("StoragePositiveSpin", new StoragePositiveSpin());
        //SmartDashboard.putData("StorageNegativeSpin", new StorageNegativeSpin());
        //SmartDashboard.putData("LauncherPositiveSpin", new LauncherPositiveSpin());
        //SmartDashboard.putData("LauncherNegativeSpin", new LauncherNegativeSpin());
        //SmartDashboard.putData("IntakeMoveNeg", new IntakeMoveNeg());
        //SmartDashboard.putData("IntakeMovePos", new IntakeMovePos());
        //SmartDashboard.putData("Pixy2Test", new Pixy2Test());
        //SmartDashboard.putData("ColorWheelSpin", new ColorWheelSpin());
        //SmartDashboard.putData("Drive off line", new DriveOffLine());
        SmartDashboard.putData("BasicAuto", new BasicAutonomous());
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
public Joystick getLeftJoystick() {
        return leftJoystick;
    }

public Joystick getRightJoystick() {
        return rightJoystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

