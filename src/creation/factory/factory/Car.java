package creation.factory.factory;

public abstract class Car {
    public String country;

    public String brand;
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Car:"+"\n");
        sb.append("  country: "+this.country+"\n");
        sb.append("  brand: "+this.brand+"\n");
        return sb.toString();
    }
}

class ChineseCar extends Car{
    public ChineseCar(){
        super();
        super.country="chinese";
    }
}

class Wuling extends ChineseCar{
    public Wuling(){
        super();
        super.brand="Wuling";
    }
}
class Byd extends ChineseCar{

    public Byd(){
        super();
        super.brand = "Byd";
    }
}




class OtherCar extends Car{
    public OtherCar(){
        super();
        super.country="other";
    }
}

class Audi extends OtherCar{
    public Audi(){
        super();
        super.brand="audi";
    }
}
class BMW extends OtherCar{
    public BMW(){
        super();
        super.brand = "BMW";
    }
}