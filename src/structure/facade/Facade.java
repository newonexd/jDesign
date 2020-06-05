package structure.facade;

public class Facade {
    private Computer mac;
    private Computer thinkPad;
    private Computer xiaoMi;
    public Facade(){
        mac = new MacComputer();
        thinkPad = new ThinkPadComputer();
        xiaoMi = new XiaoMiComputer();
    }
    public void getMac(){
         mac.makeComputer();
    }
    public void getThinkPad(){
        thinkPad.makeComputer();
    }
    public void getXiaoMi(){
        xiaoMi.makeComputer();
    }
}