package structure.decorator;

public abstract class Component extends Computer{
    
}

class Disk extends Component{
    private Computer computer;
    public Disk(Computer computer){
        this.computer = computer;
    }

    @Override
    public String getInformation() {
        return this.computer.getInformation()+"加硬盘";
    }

    @Override
    public int price() {
        return this.computer.price()+300;
    }
}

class Screen extends Component{
    private Computer computer;
    public Screen(Computer computer){
        this.computer =computer;
    }

    @Override
    public String getInformation() {
        return this.computer.getInformation()+"加显示屏";
    }

    @Override
    public int price() {
        return this.computer.price()+500;
    }

}