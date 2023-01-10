// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {

  private WPI_TalonFX m_ExampleMotor;

  public ExampleSubsystem() {
    m_ExampleMotor = new WPI_TalonFX(1);
  }

  private void setMotor(double percent){
    m_ExampleMotor.set(percent);
  }

  public void run(){
    setMotor(0.5);
  }

  public void stop(){
    setMotor(0);
  }

}
