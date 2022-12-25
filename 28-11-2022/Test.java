public class Test {
    public static void main(String[] args) {
        ObjectMethodOverwrite obj = new ObjectMethodOverwrite("Hello ", "World!");
        ObjectMethodOverwrite obj2 = new ObjectMethodOverwrite("Hello ", "ever");
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());
        System.out.println(obj.equals(obj2));
    }
}