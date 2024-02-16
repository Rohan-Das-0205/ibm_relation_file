class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Car with " + engine.getType() + " engine started.");
    }
}

class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }
}

class Dog extends Animal {
    public Dog(String species) {
        super(species);
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }
}

class Printer {
    public void print(String document) {
        System.out.println("Printing: " + document);
    }
}

class Office {
    private Printer printer;

    public Office(Printer printer) {
        this.printer = printer;
    }

    public void printDocument(String document) {
        printer.print(document);
    }
}

public class Main {
    public static void main(String[] args) {
        Engine carEngine = new Engine("V8");
        Car myCar = new Car(carEngine);

        Animal myDog = new Dog("Canine");

        Printer officePrinter = new Printer();
        Office myOffice = new Office(officePrinter);

        myCar.start();
        myDog.bark();
        myOffice.printDocument("Important Report");
    }
}
