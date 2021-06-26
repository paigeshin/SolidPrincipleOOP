public class Car {

    public double getCabinWidth() {
        // return cabin width 
    
    }

}

public class RacingCar extends Car {

    @Override 
    public double getCabinWidth() {
        //UNIMPLEMENTED!
    }

    public double getCockpitWidth() {
        //return cockput width 
    }

}


//// Refactored... Much more generic
public class Vehicle {

    public double getInteriorWidth() {
        //return interior width 
    }

}

public class Car extends Vehicle {

    @Override 
    public double getInteriorWidth() {
        return this.getCabinWidth();
    } 

    public double getCabinWidth() {
        //return cabin width 
    }

}

public class RacingCar extends Vehicle {

    @Override
    public double getInteriorWidth() {
        return this.getCockpitWidth();
    }

    public double getCockpitWidth() {
        //return cockpit width
    }

}