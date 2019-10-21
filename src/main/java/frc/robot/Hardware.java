package frc.robot;

import edu.wpi.first.wpilibj.SpeedController;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import org.montclairrobotics.alloy.frc.FRCMotor;

public class Hardware {

    //DriveTrain motors
    public static WPI_TalonSRX dt_fr;
    public static WPI_TalonSRX dt_fl;
    public static WPI_TalonSRX dt_br;
    public static WPI_TalonSRX dt_bl;

    //DriveTrain motor ids
    public final static int fr_id = 2;
    public final static int fl_id = 3;
    public final static int br_id = 1;
    public final static int bl_id = 0;
    

    public static void init() {
        //dt_fr = new WPI_TalonSRX()
    }


}
