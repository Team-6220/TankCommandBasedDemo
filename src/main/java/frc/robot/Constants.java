// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
    public static final int kOperatorControllerPort = 1;
  }
  public static class DriveConstants {
    public static final int leftMasterID = 2;
    public static final int leftSlaveID = 8;
    public static final int rightMasterID = 9;
    public static final int rightSlaveID = 1;
    public static final double deadzone = .025;

    public static final boolean rightInv = false; //TODO: confirm which should be inverted with sam
    public static final boolean leftInv = false;

  }
}
