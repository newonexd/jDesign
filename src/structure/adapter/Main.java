package structure.adapter;

public class Main {
    public static void main(String[] args){
        CatAdapter catAdapter = new CatAdapter(new WildCat());
        catAdapter.eat();
        catAdapter.wang();
    }
}