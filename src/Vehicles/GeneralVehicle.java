package Vehicles;

public class GeneralVehicle {

    private String name;
    private double acceleration;
    private double deceleration;
    private double topSpeed;

    private double position;
    private double currentSpeed;

    public GeneralVehicle(String name, double acceleration, double deceleration, double topSpeed, double position, double currentSpeed) {
        this.name = name;
        this.acceleration = acceleration;
        this.deceleration = deceleration;
        this.topSpeed = topSpeed;
        this.position = position;
        this.currentSpeed = currentSpeed;
    }


}
