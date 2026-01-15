// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystem;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.BotConstants;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */
    private final TalonFX m_IntakePivot = new TalonFX(BotConstants.Intake.pivotID);
    private final TalonFX m_IntakeRun = new TalonFX(BotConstants.Intake.intakeID);
    private final TalonFX m_IntakeBeam = new TalonFX(BotConstants.Intake.intakeBeamBreakID);

  public Intake() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
