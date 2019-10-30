/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import org.montclairrobotics.alloy.drive.DriveTrain;
import org.montclairrobotics.alloy.drive.MecanumDrive;
import org.montclairrobotics.alloy.frc.*;
import org.montclairrobotics.alloy.motor.MotorModule;
import org.montclairrobotics.alloy.utils.PID;
import org.montclairrobotics.alloy.vector.Angle;
import org.montclairrobotics.alloy.vector.Polar;
import org.montclairrobotics.alloy.vector.XY;

import java.awt.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends FRCAlloy {

    DriveTrain driveTrain;

    FRCButton button;
    FRCMotor motor;

    public void robotSetup() {
        motor.enable();
    }
    public void initialization() {
        Hardware.init();

        button = new FRCButton( new FRCJoystick(1), 1);
        motor = new FRCMotor(Hardware.rIntake);

        //All this is is an instantiation with a lot of stuff it in: Object name = new Object(parameters);
        //where the parameters also have new objects inside of them

        /*
        driveTrFRCButtonain = new MecanumDrive(
                new MotorModule(
                        new Polar(1, new Angle(45)), new XY(-1, 1),
                        new FRCEncoder(Hardware.dt_fl), new PID(0, 0, 0), new FRCMotor(Hardware.dt_fl)
                ),
                new MotorModule(
                        new Polar(-1, new Angle(-45)), new XY(1, 1),
                        new FRCEncoder(Hardware.dt_fr), new PID(0, 0, 0), new FRCMotor(Hardware.dt_fr)
                ),
                new MotorModule(
                        new Polar(1, new Angle(45)), new XY(-1, -1),
                        new FRCEncoder(Hardware.dt_bl), new PID(0, 0, 0), new FRCMotor(Hardware.dt_bl)
                ),
                new MotorModule(
                        new Polar(-1, new Angle(-45)), new XY(1, -1),
                        new FRCEncoder(Hardware.dt_br), new PID(0, 0, 0), new FRCMotor(Hardware.dt_br)
                )
        ); */
    }

    public void periodic() {
        if (button.getValue()) {
            motor.setMotorPower(0.5);
        }
    }
}
