public class Bird {

    public void fly() {
        //Fly High!
    }

}

public class Ostrich extends Bird {

    @Override
    public void fly() {
        // unimplemented
        throw new RuntimeException();
    }

}

public class CarUtils {

    public static void main(String[] args) {
        Car first = new Car();
        Car second = new Car();
        Car third = new RacingCar();

        List<Car> myCars = new ArrayList();

    }

}