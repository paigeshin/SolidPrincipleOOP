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

