import Planes.ExperimentalPlane;
import models.MilitaryType;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.*;

// version: 2.1
// made by Samandar Saidakhmatov
// 25-Jan-2021

public class Airport {
    private List<? extends Plane> planes;



    public List<PassengerPlane> getPassengerPlane() {
        List<? extends Plane> listOfPlane = this.planes;
        List<PassengerPlane> listOfPassengerPlane = new ArrayList<>();
        for (Plane plane : listOfPlane) {
            if (plane instanceof PassengerPlane) {
                listOfPassengerPlane.add((PassengerPlane) plane);
            }
        }
        return listOfPassengerPlane;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> listOfMilitaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                listOfMilitaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return listOfMilitaryPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanesCapacity = getPassengerPlane();
        PassengerPlane planeWithMaxCapacity = passengerPlanesCapacity.get(0);
        for (int i = 0; i < passengerPlanesCapacity.size(); i++) {
            if (passengerPlanesCapacity.get(i).getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlanesCapacity.get(i);
            }
        }
        return planeWithMaxCapacity;
    }



    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            MilitaryPlane plane = militaryPlanes.get(i);
            if (plane.getType() == MilitaryType.TRANSPORT) {
                transportMilitaryPlanes.add(plane);
            }
        }
        return transportMilitaryPlanes;
        }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            MilitaryPlane plane = militaryPlanes.get(i);
            if (plane.getType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanes.add(plane);
            }
        }
        return bomberMilitaryPlanes;

    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> listOfExperimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                listOfExperimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return listOfExperimentalPlanes;
    }

    public Airport sortByMaxDistance() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.GetMaxFlightDistance() - o2.GetMaxFlightDistance();
            }
        });
        return this;
    }


    /**
     * Sorts by max speed
     * @return Airport
     */
    public Airport sortByMaxSpeed() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMaxSpeed() - o2.getMaxSpeed();
            }
        });
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMaxLoadCapacity() - o2.getMaxLoadCapacity();
            }
        });
        return this;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    private void print(Collection<? extends Plane> collection) {
        Iterator<? extends Plane> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Plane plane = iterator.next();
            System.out.println(plane);
        }
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }

    //Constructor
    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

}
