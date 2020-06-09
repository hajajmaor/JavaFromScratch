
public class Dog extends Animal {
	
	int smellSenseRate; 
	
	Dog(String name,String breed,String color,int smellSenseRate){
		super(4,name,breed,color);
		this.smellSenseRate=smellSenseRate;
	}

	@Override
	void go() {
		System.out.println("Walking..");
	}

	@Override
	void eat() {
		System.out.println("Eating Bonzo..");
	}

	@Override
	void talk() {
		System.out.println("Barking..");
		
	}

	public String toString() {
		String str="Dog: smell sense rate: "+smellSenseRate
				+", "+super.toString() ;
		return str;
	}
}


// public private protected
/*
 * 
 */
