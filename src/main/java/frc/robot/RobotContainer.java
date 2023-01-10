// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.StartEndCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class RobotContainer {

  private CommandXboxController m_Controller = new CommandXboxController(0);

  private ExampleSubsystem m_ExampleSubsystem = new ExampleSubsystem();

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {

    //Normal hold button
    m_Controller.a().whileTrue(
      new StartEndCommand(
        m_ExampleSubsystem::run, 
        m_ExampleSubsystem::stop, 
        m_ExampleSubsystem
      )
    );

    //Toggle button
    m_Controller.b().toggleOnTrue(
      new StartEndCommand(
        m_ExampleSubsystem::run, 
        m_ExampleSubsystem::stop, 
        m_ExampleSubsystem
      )
    );

  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
