package frc.robot;

import edu.wpi.first.wpilibj.SpeedController;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Hardware {

    //DriveTrain motors
    public static WPI_TalonSRX dt_fr;
    public static WPI_TalonSRX dt_fl;
    public static WPI_TalonSRX dt_br;
    public static WPI_TalonSRX dt_bl;

    //DriveTrain motor ids
    public final static int DT_FRONT_LEFT = 2;
    public final static int DT_FRONT_RIGHT = 3;
    public final static int DT_BACK_LEFT = 1;
    public final static int DT_BACK_RIGHT = 0;
    

    public static void init() {
        dt_fr = new WPI_TalonSRX(DT_FRONT_RIGHT);
        dt_fl = new WPI_TalonSRX(DT_FRONT_LEFT);
        dt_br = new WPI_TalonSRX(DT_BACK_RIGHT);
        dt_bl = new WPI_TalonSRX(DT_BACK_LEFT);
        }


}
