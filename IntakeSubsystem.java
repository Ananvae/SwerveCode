package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    private final MotorController intakeMotor;

    public IntakeSubsystem() {
        intakeMotor = new PWMVictorSPX(0); // Replace with the correct PWM port
    }

    public void runIntake(double speed) {
        intakeMotor.set(speed);
    }

    public void stopIntake() {
        intakeMotor.set(0);
    }
}
