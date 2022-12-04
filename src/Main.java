public class Main {
    public static void main(String[] args) {
        Car suzuki = new Car("Suzuki", "XC90", 3.2, TypeOfBody.CROSSOVER);
        Car honda = new Car("Honda", "Civic", 3.1, TypeOfBody.HATCHBACK);
        Car kia = new Car("Kia", "Sorento", 2.8, TypeOfBody.SEDAN);


        Truck maz = new Truck("Maz", "5566", 2.2, Weight.N3);
        Truck iveco = new Truck("Iveco", "777", 2.5, Weight.N1);
        Truck kamaz = new Truck("Kamaz", "333", 3.0, Weight.N2);


        Bus man = new Bus("Man", "88", 2.0, Capacity.LARGE);
        Bus merseders = new Bus("Merseders", "3377", 3.0, Capacity.EXTRA_LARGE);
        Bus ikarus = new Bus("Ikarus", "43", 2.2, Capacity.MIDDLE);

    }

    private static void printInfo(Transport transport) {
        System.out.println(transport.getBrand() + transport.getModel() + transport.getEngineVolume());
    }
   transport.printType();
}
