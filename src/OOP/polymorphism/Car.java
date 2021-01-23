package OOP.polymorphism;

/**
 * @author Hammad on 23/01/2021.
 * @project Java_Masterclass
 */
public class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("Car class ->  Starting Engine");
    }

    public void accelarate() {
        System.out.println("Car class -> accelarating");
    }

    public void brake() {
        System.out.println("Car class -> braking");
    }

    public String getName() {
        return name;
    }
}

class Toyota extends Car {

    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Toyota class -> starting engine");
    }

    @Override
    public void accelarate() {
        System.out.println("Toyota class -> accelarating");
    }

    @Override
    public void brake() {
        System.out.println("toyota class -> braking");
    }
}

class Bmw extends Car {

    public Bmw(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("BMW class -> starting engine");
    }

    @Override
    public void accelarate() {
        System.out.println("BMW class -> accelarating");
    }

    @Override
    public void brake() {
        System.out.println("BMW class -> braking");
    }
}

class Vw extends Car {

    public Vw(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("VW class -> starting engine");
    }

    @Override
    public void accelarate() {
        System.out.println("VW class -> accelarating");
    }

    @Override
    public void brake() {
        System.out.println("VW class -> braking");
    }
}

class MainCar {

    public static void main(String[] args) {

        Car car = new Car("Base car", 8);
        car.startEngine();
        car.accelarate();
        car.brake();

        for (int i = 1; i < 11; i++) {
            car = randomCar();
            System.out.println("Car# " + i + "\n" + car.getName());
            car.startEngine();
            System.out.println();
        }

    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated is: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Toyota("Toyota", 4);

            case 2:
                return new Bmw("BMW", 6);

            case 3:
                return new Vw("VW", 5);
        }

        return null;
    }
}
