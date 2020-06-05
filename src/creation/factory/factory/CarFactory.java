package src.creation.factory.factory;

public interface CarFactory {
    Car makeCar(String brand);
}

class ChineseCarFactory implements CarFactory {

    @Override
    public Car makeCar(String brand) {
        if (brand.equals("Wuling")) {
            ChineseCar car = new Wuling();
            return car;
        } else if (brand.equals("Byd")) {
            ChineseCar car = new Byd();
            return car;
        } else {
            return null;
        }
    }

}

class OtherCarFactory implements CarFactory {

    @Override
    public Car makeCar(String brand) {
        if (brand.equals("audi")) {
            OtherCar car = new Audi();
            return car;
        } else if (brand.equals("BMW")) {
            OtherCar car = new BMW();
            return car;
        } else {
            return null;
        }
    }
}