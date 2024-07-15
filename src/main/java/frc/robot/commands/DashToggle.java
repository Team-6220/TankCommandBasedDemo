// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.DriveSubsystem;

import edu.wpi.first.wpilibj2.command.Command;

public class DashToggle extends Command {
  /** Creates a new DashToggle. */
  private DriveSubsystem driveTrain;
  private boolean end = false;

  public DashToggle(DriveSubsystem drive, boolean toggle) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(drive);
    driveTrain = drive;
    driveTrain.isDashing = toggle;
    end = true;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return end;
  }
}
