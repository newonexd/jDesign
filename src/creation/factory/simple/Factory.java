package creation.factory.simple;

public class Factory {
    public static Car makeCar(String brand){
        if(brand.equals("audi")){
            Car car = new Audi();
            return car;
        }else if(brand.equals("BMW")){
            Car car = new BMW();
            return car;
        }else{
            return null;
        }
    }
}