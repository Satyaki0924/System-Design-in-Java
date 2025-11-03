import java.util.ArrayList;
import java.util.List;

interface Drivable {
 void drivingMechanism();
}

class Car implements Drivable {

    @Override
    public void drivingMechanism() {
       System.err.println("Using Engine and 4 wheels to drive");
    }
    
}

class EVBike implements Drivable {

    @Override
    public void drivingMechanism() {
        System.err.println("Using Battery and 2 wheels to drive");
    }

}

class EVCar implements Drivable {

    @Override
    public void drivingMechanism() {
        System.err.println("Using Battery and 4 wheels to drive");
    }

}

class Bicycle implements Drivable {

    @Override
    public void drivingMechanism() {
        System.err.println("Using 2 wheels to drive through pedalling");
    }

}


public class Realization {
    public static void main(String[] args) {
        List<Drivable> garage = new ArrayList<>();
        garage.add(new Car());
        garage.add(new EVBike());
        garage.add(new Bicycle());
        garage.add(new EVCar());

        for (Drivable vehicle : garage) {
            vehicle.drivingMechanism();
        }
    }
}
