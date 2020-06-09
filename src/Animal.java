
public abstract class Animal {
	
	static int counter=0;
	
	//תכונות של המחלקה
	int noOfFeets;
	String name;
	String breed;
	String color;
	
	
	//מתודה בונה של המחלקה
	Animal(int noOfFeets,String name,String breed,String color){
		this.noOfFeets=noOfFeets;
		this.breed=breed;
		this.color=color;
		this.name=name;
		
		counter++;
	}

	//מתודות של המחלקה
	abstract void go();
	abstract void eat();
	abstract void talk();
	
	protected void sleep() {
		System.out.println("Sleeping..");
	}
	
	public String toString() {
		return "name: "+name+", breed: "+breed+", colors:"
	+color+", no. of feets: "+noOfFeets;
	}
}
