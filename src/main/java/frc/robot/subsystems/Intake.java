package frc.robot.subsystems;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    
    private final SparkMax intakeMotor = new SparkMax(50, MotorType.kBrushless);
    private XboxController controller;

    public Intake(XboxController controller) {
        this.controller = controller;
    }

    @Override
    public void periodic() {
        if(controller.getAButton()) {
            RunIntake();
        } else {
            StopIntake();
        }
    }

    public void RunIntake() {
        intakeMotor.set(-0.50f);
    }

    public void StopIntake() {
        intakeMotor.set(0);
    }
}
