package vehicle;

public class Jumpers extends Vehicle{
    public Jumpers(int id) {
        super(id);
    }

    @Override
    public void move(int id) {
        System.out.println("Джампери №" + id + "пересуваються");
    }
}

