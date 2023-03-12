public class Truck extends MotorVehicle{
@Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
@Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void service() {
    }
}

