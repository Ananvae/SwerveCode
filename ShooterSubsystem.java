package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {
    private final MotorController shooterMotor;

    public ShooterSubsystem() {
        shooterMotor = new PWMVictorSPX(1); // Replace with the correct PWM port
    }

    public void shoot(double speed) {
        shooterMotor.set(speed);
    }

    public void stopShooter() {
        shooterMotor.set(0);
    }
}

