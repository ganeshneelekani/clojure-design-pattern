package clojure_design_pattern.behavioral.command.java;

public class TurnOnLightCommand implements ICommand {

    Light light;

    public TurnOnLightCommand(Light light) {
        super();
        this.light = light;
    }

    public void execute() {
        System.out.println("Turning on light.");
        light.turnOn();
    }
}
