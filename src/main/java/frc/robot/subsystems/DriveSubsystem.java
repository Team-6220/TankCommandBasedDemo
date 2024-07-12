// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;


public class DriveSubsystem extends SubsystemBase {
  /** Creates a new DriveSubsystem. */

  private TalonSRX leftMaster;
  private TalonSRX rightMaster;
  private TalonSRX leftSlave;
  private TalonSRX rightSlave;

  public DriveSubsystem() {
    
    TalonSRX leftMaster = new TalonSRX(Constants.DriveConstants.leftMasterID);
    TalonSRX rightMaster = new TalonSRX(Constants.DriveConstants.rightMasterID);
    TalonSRX leftSlave = new TalonSRX(Constants.DriveConstants.leftSlaveID);
    TalonSRX rightSlave = new TalonSRX(Constants.DriveConstants.rightSlaveID);

    leftMaster.setInverted(Constants.DriveConstants.leftInv);
    rightMaster.setInverted(Constants.DriveConstants.rightInv);
    leftSlave.setInverted(Constants.DriveConstants.leftInv);
    rightSlave.setInverted(Constants.DriveConstants.rightInv);

  }

  public void setLeft(double output) {
    leftMaster.set(ControlMode.PercentOutput, output);
    leftSlave.follow(leftMaster);
  }

  public void setRight(double output) {
    rightMaster.set(ControlMode.PercentOutput, output);
    rightSlave.follow(rightMaster);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
