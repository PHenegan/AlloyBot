/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import org.montclairrobotics.alloy.drive.DriveModule;
import org.montclairrobotics.alloy.frc.FRCAlloy;
import org.montclairrobotics.alloy.frc.FRCMotor;
import org.montclairrobotics.alloy.motor.MotorGroup;
import org.montclairrobotics.alloy.vector.XY;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends FRCAlloy {
  
  //drive train motors
  FRCMotor fr = new FRCMotor(Hardware.dt_fr);
  FRCMotor fl = new FRCMotor(Hardware.dt_fl);
  FRCMotor br = new FRCMotor(Hardware.dt_br);
  FRCMotor bl = new FRCMotor(Hardware.dt_bl);
  //DriveModule rightModule = new DriveModule();
  //DriveModule leftModule = new DriveModule();

  public void robotSetup() {
    Hardware.init();
  }

  public void initialization(){

  }

  public void periodic() {

  }
}
