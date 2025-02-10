// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Intake extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public Intake() {}

  private final CANSparkMax intakeMotor = new CANSparkMax(10, MotorType.kBrushless); // might not be 10


public Command runForwardIntake() {
  if(intakeMotor.getOutputCurrent() < 45){ 
    return run(() -> intakeMotor.set(CANSparkMax.PercentOutput, 1))
    .withName("Intake");
  } else {
    return run(() -> intakeMotor.set(CANSparkMax.PercentOutput, 0))
    .withName("Intake Stopped");
  }
  }

  public Command runBackwardIntake() {
    return run(() -> intakeMotor.set(CANSparkMax.PercentOutput, -1))
    .withName("Reverse Intake");
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }


}