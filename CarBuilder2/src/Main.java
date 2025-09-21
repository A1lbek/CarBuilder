interface CarFactory {
    Car createCar();
}

class ToyotaFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Car.Builder()
                .brand("Toyota")
                .model("Camry")
                .year(2024)
                .color("Black")
                .build();
    }
}

class BMWFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Car.Builder()
                .brand("BMW")
                .model("M3")
                .year(2024)
                .color("Blue")
                .build();
    }
}

// Abstract Factory
interface AbstractCarFactory {
    Car createSedan();
    Car createSportsCar();
}

class AsianCarFactory implements AbstractCarFactory {
    @Override
    public Car createSedan() {
        return new Car.Builder()
                .brand("Toyota")
                .model("Camry")
                .year(2024)
                .color("White")
                .build();
    }

    @Override
    public Car createSportsCar() {
        return new Car.Builder()
                .brand("Lexus")
                .model("LC500")
                .year(2024)
                .color("Red")
                .build();
    }
}

class EuropeanCarFactory implements AbstractCarFactory {
    @Override
    public Car createSedan() {
        return new Car.Builder()
                .brand("Audi")
                .model("A4")
                .year(2024)
                .color("Grey")
                .build();
    }

    @Override
    public Car createSportsCar() {
        return new Car.Builder()
                .brand("BMW")
                .model("M3")
                .year(2024)
                .color("Blue")
                .build();
    }
}

// Demo
public class Main {
    public static void main(String[] args) {
        // Factory Method
        CarFactory toyotaFactory = new ToyotaFactory();
        CarFactory bmwFactory = new BMWFactory();

        Car toyota = toyotaFactory.createCar();
        Car bmw = bmwFactory.createCar();

        System.out.println("Factory Method:");
        System.out.println(toyota);
        System.out.println(bmw);

        AbstractCarFactory asianFactory = new AsianCarFactory();
        AbstractCarFactory europeanFactory = new EuropeanCarFactory();

        Car asianSedan = asianFactory.createSedan();
        Car asianSports = asianFactory.createSportsCar();
        Car euroSedan = europeanFactory.createSedan();
        Car euroSports = europeanFactory.createSportsCar();

        System.out.println("\nAbstract Factory:");
        System.out.println("Asian Sedan: " + asianSedan);
        System.out.println("Asian Sports Car: " + asianSports);
        System.out.println("European Sedan: " + euroSedan);
        System.out.println("European Sports Car: " + euroSports);
    }
}
