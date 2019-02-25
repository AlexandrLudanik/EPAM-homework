import planes.FuturePlane;
import planes.MilitaryPlane;
import planes.PassengerPlane;
import planes.Plane;
import types.ProjectType;
import types.SpaceType;
import types.MilitaryType;

import java.util.Arrays;
import java.util.List;

public class Main {

    static List<Plane> planes = Arrays.asList(
            new PassengerPlane("Airbus", 500, 10000, 50000, 110),
            new PassengerPlane("IL", 700, 5000, 80000, 95),
            new MilitaryPlane("B-52 ", 10000, 15000, 25000, MilitaryType.STRATEGY),
            new MilitaryPlane("F-15", 1000, 6000, 8000, MilitaryType.FIGHTER),
            new PassengerPlane("Boeing", 400, 9000, 30000, 90),
            new MilitaryPlane("AN-26", 500, 12000, 50000, MilitaryType.TRANSPORT),
            new FuturePlane("Voyager", 12000, 50000, 5000, SpaceType.SPACE, ProjectType.IN_DEVELOP),
            new FuturePlane("Buran", 10000, 25000, 7000, SpaceType.ORBITAL, ProjectType.PROTOTYPE),
            new FuturePlane("MoonExpress", 100000, 700000, 11000, SpaceType.DEEP_SPACE, ProjectType.DREAM)
    );


    public static void main(String[] args) {
        AirCompany airCompany = new AirCompany(planes);
        AirCompany futureAirCompany = new AirCompany(airCompany.getFuturePlanes());
        AirCompany militaryAirCompany = new AirCompany(airCompany.getMilitaryPlanes());
        AirCompany passengerAirCompany = new AirCompany(airCompany.getPassengerPlane());

        System.out.println("Future air company sorted by distance: " + futureAirCompany
                .sortByDistance()
                .toString());
        System.out.println("Military air company sorted by distance: " + militaryAirCompany
                .sortByDistance()
                .toString());
        System.out.println("Passenger air company sorted by distance: " + passengerAirCompany
                .sortByDistance()
                .toString());

    }
}
