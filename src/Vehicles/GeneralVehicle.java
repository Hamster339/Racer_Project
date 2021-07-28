package Vehicles;

import Control.Controller;

public class GeneralVehicle {

    private final String name;          // Name of vehicle
    private final double acceleration;  // acceleration in m/s squared
    private final double deceleration;  // deceleration in m/s squared
    private final double topSpeed;      // top speed in m/s

    private double position;            // position in m from start
    private double currentSpeed;        // current speed in m/s

    public GeneralVehicle(String name, double acceleration, double deceleration, double topSpeed, double position, double currentSpeed) {
        this.name = name;
        this.acceleration = acceleration;
        this.deceleration = deceleration;
        this.topSpeed = topSpeed;
        this.position = position;
        this.currentSpeed = currentSpeed;
    }

    public String getName() {
        return name;
    }

    public double getPosition() {
        return position;
    }

    public void start() {
        move();
    }

    public void move() {

        double stoppingDistance = Controller.getTrackLength();



    }

    public void accelerate() {

        double step = 100 / this.acceleration;
        
        //accelerates smoothly over the course of a second, but does not accelerate above top speed
        for (int time = 0; time <= 1000; time = time + 10) {
            wait(10);
            double newSpeed = this.currentSpeed + this.acceleration;
            if (newSpeed < this.topSpeed) {
                this.currentSpeed = newSpeed;
            }
            
            position += currentSpeed;
        }
    }
    
    public void decelerate(){

        double step = 100 / this.deceleration;

        for (int time = 0; time <= 1000; time = time + 10) {
            wait(10);
            double newSpeed = this.currentSpeed - this.acceleration;
            if (newSpeed < 0) {
                this.currentSpeed = newSpeed;
            }

            position += currentSpeed;
        }
    }
}
