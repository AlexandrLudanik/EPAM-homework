package planes;

import java.util.Objects;

abstract public class Plane {

    private int capacity;
    private int speed;
    private int flightDistance;
    private String model;


    public Plane(String model, int speed, int flightDistance, int capacity) {
        this.model = model;
        this.speed = speed;
        this.flightDistance = flightDistance;
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFlightDistance() {
        return flightDistance;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", flightDistance=" + flightDistance +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return speed == plane.speed &&
                flightDistance == plane.flightDistance &&
                capacity == plane.capacity &&
                Objects.equals(model, plane.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, speed, flightDistance, capacity);
    }
}
