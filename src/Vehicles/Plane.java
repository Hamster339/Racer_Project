package Vehicles;

public class Plane extends GeneralVehicle  {

    private int preFlightChecks;    // number of pre-flight checks that need to be completed before take-off

    public Plane (String name, double acceleration, double deceleration, double topSpeed, double position, double currentSpeed, int preFlightChecks) {
        super(name, acceleration, deceleration, topSpeed, position, currentSpeed);
        this.preFlightChecks = preFlightChecks;
    }

}
