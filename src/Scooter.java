public class Scooter implements IFactory {
    @Override
    public void create(int quantity) {
        System.out.println("Create " + quantity + " Scooter");
    }
}
