package vehicle;


    public class Car extends Vehicle {
        public Car(int id) {
            super(id);
        }

        @Override
        public void move(int id) {
            System.out.println("Автомобіль №" + id + " їде");
        }
    }


