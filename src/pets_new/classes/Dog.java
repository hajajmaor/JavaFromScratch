package pets_new.classes;

import pets_new.enums.Gender;
import pets_new.interfaces.FourLegsAnimal;

public class Dog extends Animal implements FourLegsAnimal {

    final Gender gender;

    public Dog(String name, int age, Gender gender) {
        super(name, age);
        this.gender = gender;
    }

    @Override
    public void feed() {
        System.out.println("Eating Bonzo");
    }

}
