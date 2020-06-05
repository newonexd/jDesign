package structure.adapter;

public class CatAdapter implements Dog{
    private Cat cat;
    public CatAdapter(Cat cat){
        this.cat = cat;
    }

	@Override
	public void wang() {
		cat.miao();
	}

	@Override
	public void eat() {
		cat.eat();
	}
    
}