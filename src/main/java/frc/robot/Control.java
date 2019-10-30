package frc.robot;

import org.montclairrobotics.alloy.frc.FRCButton;
import org.montclairrobotics.alloy.frc.FRCJoystick;

public class Control {
    //IDs  -- NOT REAL VALUES!
    public final static int BUTTON_ID_CIRCLE = 0;
    public final static int BUTTON_ID_SQUARE = 1;
    public final static int BUTTON_ID_X = 2;
    public final static int BUTTON_ID_TRIANGLE = 3;

    public final static int BUTTON_ID_START = 4;
    public final static int BUTTON_ID_SELECT = 5;



    //Buttons
     public static FRCButton intake_down;
     public static FRCButton intake_up;
     public static FRCButton hatch;

     //Joysticks
     public static FRCJoystick drive_stick_0;
     public static FRCJoystick drive_stick_1;

     //Initialize all of the above objects here
     public static void init() {

     }

}
