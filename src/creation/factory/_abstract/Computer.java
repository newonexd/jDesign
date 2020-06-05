package src.creation.factory._abstract;


public class Computer {
    Cpu cpu;
    Screen screen;
    public Computer(Cpu cpu,Screen screen){
        if(!cpu.cpu.equals(screen.screen)){
            System.out.println("型号不匹配！");
            return;
        }
        this.cpu = cpu;
        this.screen = screen;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Computer:"+"\n");
        sb.append("  cpu: "+this.cpu+"\n");
        sb.append("  screen: "+this.screen+"\n");
        return sb.toString();
    }
}

