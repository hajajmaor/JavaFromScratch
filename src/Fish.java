
public class Fish extends Animal {

	
	
	public Fish(String name,String breed,String color){
		super(0,name,breed,color);
	}

	@Override
	void go() {
		System.out.println("swimming..");
	}

	@Override
	void eat() {
		System.out.println("Eating other fish");
	}

	@Override
	void talk() {
		System.out.println("Blop Blop..");

	}

}
