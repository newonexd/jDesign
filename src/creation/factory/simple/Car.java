package src.creation.factory.simple;

/**
 *  抽象为车
 */
public abstract class Car {
    public String brand;

    public String getBrand(){
        return this.brand;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Car:"+"\n");
        sb.append("  brand: "+this.brand+"\n");
        return sb.toString();
    }
}

class Audi extends Car{
    public Audi(){
        super();
        super.brand = "audi";
    }
}

class BMW extends Car{
    public BMW(){
        super();
        super.brand="BMW";
    }
}