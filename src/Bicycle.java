public class Bicycle extends WheeledTransport{

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void service() {
    }
}