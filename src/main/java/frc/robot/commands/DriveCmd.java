// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.DriveSubsystem;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import java.util.function.Supplier;

public class DriveCmd extends Command {
  /** Creates a new DriveCmd. */

  DriveSubsystem driveTrain;
  Supplier<Double> velocity;
  Supplier<Double> rotation;

  public DriveCmd(DriveSubsystem drive, Supplier<Double> v, Supplier<Double> r) {
    // Use addRequirements() here to declare subsystem dependencies.
    driveTrain = drive;
    velocity = v;
    rotation = r;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double dz = Constants.DriveConstants.deadzone;
    double v = Math.abs(velocity.get()) > dz? velocity.get(): 0;
    double r = Math.abs(rotation.get()) > dz? rotation.get(): 0;
    SmartDashboard.putNumber("vLeft", v + r / 2);
    SmartDashboard.putNumber("vRight", v - r / 2);
    driveTrain.setLeft(v + r / 2);
    driveTrain.setRight(v - r / 2);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveTrain.setLeft(0);
    driveTrain.setRight(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
