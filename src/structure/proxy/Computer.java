package structure.proxy;

public class Computer {
    public String cpu;
    public String screen;
    public void setCpu(String cpu){
        this.cpu = cpu;
    }
    public void setScreen(String screen){
        this.screen = screen;
    }

    @Override
    public String toString(){
        return "Computer: \n  cpu:"+this.cpu+"\n  screen: "+this.screen;
    }
}