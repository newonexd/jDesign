package behavior.template;

public class Main {
    public static void main(String[] args){
        Template template = new Concrete();
        template.templateMethod();
    }
}