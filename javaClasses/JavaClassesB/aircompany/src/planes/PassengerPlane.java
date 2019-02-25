package planes;

public class PassengerPlane extends Plane {

    private int passangerCapasity;


    public PassengerPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passangerCapasity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passangerCapasity = passangerCapasity;
    }

    public int getPassangerCapasity() {
        return passangerCapasity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", passangerCapasity = " + passangerCapasity + '}');
    }
}
