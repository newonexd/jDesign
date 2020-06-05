package structure.facade;

public class Main {
    public static void main(String[] args){
        Facade facade = new Facade();
        facade.getMac();
        facade.getThinkPad();
        facade.getXiaoMi();
    }
}