public class ConcreteVehicleFactory extends VehicleFactory {
    private Bike bike;

    @Override
    public IFactory getVehicle(String vehicle) {
        return switch (vehicle) {
            case "Bike" -> new Bike();
            case "Scooter" -> new Scooter();
            default -> null;
        };
    }
}
