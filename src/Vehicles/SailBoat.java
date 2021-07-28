package Vehicles;

public class SailBoat extends GeneralVehicle  {

    private int numOfSails;         // number of sails that need to be put up before sailing can commence

    public SailBoat (String name, double acceleration, double deceleration, double topSpeed, double position, double currentSpeed, int numOfSails) {
        super(name, acceleration, deceleration, topSpeed, position, currentSpeed);

        this.numOfSails = numOfSails;
    }

}
