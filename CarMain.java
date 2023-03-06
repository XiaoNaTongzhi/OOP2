public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Жигули", 1995, 20.2, "Зелёный", 50);

        car1.GetInfo();

        System.out.println("Старая цена: " + car1.GetPrice());
        car1.SetPrice(30.5);
        System.out.println("Новая цена: " + car1.GetPrice());

        car1.driveTo("Питер");
        car1.powerOn();
        car1.driveTo("Тбилиси");

    }
}
