class Engine {
    constructor(type) {
        this.type = type;
    }

    getType() {
        return this.type;
    }
}

class Car {
    constructor(engine) {
        this.engine = engine;
    }

    start() {
        console.log(`Car with ${this.engine.getType()} engine started.`);
    }
}

class Animal {
    constructor(species) {
        this.species = species;
    }

    getSpecies() {
        return this.species;
    }
}

class Dog extends Animal {
    bark() {
        console.log("Woof! Woof!");
    }
}

class Printer {
    print(document) {
        console.log("Printing: " + document);
    }
}

class Office {
    constructor(printer) {
        this.printer = printer;
    }

    printDocument(document) {
        this.printer.print(document);
    }
}

// Usage
const carEngine = new Engine("V8");
const myCar = new Car(carEngine);

const myDog = new Dog("Canine");

const officePrinter = new Printer();
const myOffice = new Office(officePrinter);

myCar.start();
myDog.bark();
myOffice.printDocument("Important Report");
