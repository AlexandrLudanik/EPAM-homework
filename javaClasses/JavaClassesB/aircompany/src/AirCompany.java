import planes.FuturePlane;
import planes.MilitaryPlane;
import planes.PassengerPlane;
import planes.Plane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AirCompany {

    public AirCompany(List<? extends Plane> planes) {
        this.planes = planes;
    }

    private List<? extends Plane> planes;

    /**
     * Create list of MilitaryPlanes
     * @return militaryPlanes
     */
    List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }


    /**
     * Create list of FuturePlanes
     * @return futurePlanes
     */
    List<FuturePlane> getFuturePlanes() {
        List<FuturePlane> futurePlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof FuturePlane) {
                futurePlanes.add((FuturePlane) plane);
            }
        }
        return futurePlanes;
    }

    /**
     * Create list of PassengerPlanes
     * @return passengerPlanes
     */
    List<PassengerPlane> getPassengerPlane() {
        List<? extends Plane> planes = this.planes;
        List<PassengerPlane> passengerPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof PassengerPlane) {
                passengerPlanes.add((PassengerPlane) plane);
            }
        }
        return passengerPlanes;
    }


    /**
     * Sorts by max distance
     * @return Airport
     */
    AirCompany sortByDistance() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane currentPlane, Plane nextPlane) {
                return currentPlane.getFlightDistance() - nextPlane.getFlightDistance();
            }
        });
        return this;
    }

    List<? extends Plane> getPlanes() {
        return planes;
    }

    @Override
    public String toString() {
        return "AirCompany{" +
                "planes=" + planes.toString() +
                '}';
    }
}
