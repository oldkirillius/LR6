package main;
import vehicle.*;
import java.util.Random;
public class Main {


	// write your code here
        public static void main(String[] args) {
            Random random = new Random();
            int num;
            Server serv = new Server(4,15);

            Bicycle b;
            Car c;
            RollerSkates r;
            Jumpers j;

            for(int i=0;i<15;i++) {
                num = random.nextInt(4);
                switch (num) {
                    case 0:
                        b = new Bicycle(i);
                        serv.addTransport(0, b,i);
                        break;
                    case 1:
                        c = new Car(i);
                        serv.addTransport(1, c,i);
                        break;
                    case 2:
                        r = new RollerSkates(i);
                        serv.addTransport(2, r,i);
                        break;
                    case 3:
                        j = new Jumpers(i);
                        serv.addTransport(3, j,i);
                        break;
                }
            }

            int veh[] = serv.getCountVehicles();
            System.out.println("Bic: " + veh[0]);
            System.out.println("Cars: " + veh[1]);
            System.out.println("Rollers: " + veh[2]);
            System.out.println("Jumpers: " + veh[3]);
            // write your code here


            System.out.println("_____________________________________________________________________");

            Bus m1;
            Tractor m2;
            TractorCrawler m3;
            TractorWheeled m4;
            ServerMachines sm = new ServerMachines(4,15);

            for(int i=0;i<15;i++) {
                num = random.nextInt(4);
                switch (num) {
                    case 0:
                        m1 = new Bus("Bus",322.32,99.9,28);
                        sm.addTransport(num,m1);
                        break;
                    case 1:
                        m2 = new Tractor("Tractor",32322.32,919.9,2,"xz");
                        sm.addTransport(num,m2);
                        break;
                    case 2:
                        m3 = new TractorCrawler("TractorCr",32622.32,119.9,2,"xz");
                        sm.addTransport(num,m3);
                        break;
                    case 3:
                        m4 = new TractorWheeled("TractorWh",31122.32,219.9,2,"xz");
                        sm.addTransport(num,m4);
                        break;
                }
            }

            int mach[] = sm.getCountVehicles();
            System.out.println("Buses: " + mach[0]);
            System.out.println("Tractors: " + mach[1]);
            System.out.println("TractorCrawlers: " + mach[2]);
            System.out.println("TractorWheeleds: " + mach[3]);
        }
    }








