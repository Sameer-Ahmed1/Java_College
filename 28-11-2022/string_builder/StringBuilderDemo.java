public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        str.insert(3,'p');
        str.delete(4,6);
        str.replace(4,4," me");
        System.out.println(str);


    }
}
