public class Dog extends Animal {
    public Dog(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public void say() {
        System.out.println("Woof! Woof!");
    }
}