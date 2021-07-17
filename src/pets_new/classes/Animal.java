package pets_new.classes;

public abstract class Animal {
    final String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void feed();

    public void sleep() {
        System.out.println("Good Night");
    }

    public void birthday() {
        this.age++;
        System.out.println("Happy Birthday");
    }
}
