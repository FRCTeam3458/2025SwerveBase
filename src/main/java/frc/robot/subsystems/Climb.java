// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Climb extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public Climb() {}

  private final CANSparkMax climb = new CANSparkMax(10, MotorType.kBrushless); 


public Command climbUp() {
 
    return run(() -> intakeMotor.set(CANSparkMax.PercentOutput, 0.1))
    .withName("climbUp");
  
  }

  public Command climbDown() {
    return run(() -> intakeMotor.set(CANSparkMax.PercentOutput, -0.1))
    .withName("climbDn");
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }


}