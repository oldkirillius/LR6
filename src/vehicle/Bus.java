package vehicle;

public class Bus extends Machine {
    public Bus(String name, double weight, double maxSpeed, int numberOfPassengers) {
        super(name, weight, maxSpeed, numberOfPassengers);
    }
    public int getNumberOfPassengers(){
        return this.numberOfPassengers;
    }

}

