
public class Day5 {
    static class Car {
        String color;
        String brand;
        int speed;
        int fuel;

        public Car(String brand, String color, int fuel) {
            this.brand = brand;
            this.color = color;
            this.fuel = fuel;
            this.speed = 0;
        }

        public void accelerate() {
            if (fuel > 0) {
                speed += 10;
                fuel -= 5;
                System.out.println(" accelerated. Speed: " + speed +
                        " km/h | Fuel: " + fuel + "%");
            }
        }

        public void decelerate() {
            if (speed > 0) {
                speed -= 10;
                System.out.println( " slowed down. Speed: " + speed + " km/h");
            }
        }

        public void refill() {
            fuel += 20;
            if (fuel > 100) {
                fuel = 100;
            }
            System.out.println( " refueled. Current Fuel: " + fuel + "%");
        }

        public void showFuel() {
            System.out.println("Fuel Status of " + fuel + "%");
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car("Tata", "Red", 30);

        myCar.showFuel();
        myCar.accelerate();
        myCar.accelerate();
        myCar.decelerate();
        myCar.refill();
        myCar.showFuel();
    }
}
