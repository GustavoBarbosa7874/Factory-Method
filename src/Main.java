public class Main {
    public static void main(String[] args) {

        VehicleFactory factory = new ConcreteVehicleFactory();

        IFactory scooter = factory.getVehicle("Scooter");
        IFactory bike = factory.getVehicle("Bike");

        if(scooter != null) {
            scooter.create(10);
        }

        if(bike != null) {
            bike.create(12);
        }
    }
}
