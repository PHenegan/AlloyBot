package frc.robot;

import org.montclairrobotics.alloy.core.Button;
import org.montclairrobotics.alloy.utils.Input;

public class MotorInput implements Input<Double> {

    private final Button b;
    private double output;

    public MotorInput(Button b, double output){
        this.b = b;
        this.output = output;
    }

    @Override
    public Double get() {
        return b.getValue() ? output : 0;
    }
}
