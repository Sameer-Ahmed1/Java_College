public class Test 
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(23.4, 3423.4);
        Rectangle r3 = new Rectangle(44.232);
        double r1Area = r1.area();
        double r2Area = r2.area();
        double r3Area = r3.area();
        System.out.println("r1 area: " + r1Area + "\nr2 area: " + r2Area + "\nr3 area: " + r3Area );
        double r1Perm = r1.perimeter();
        double r2Perm = r2.perimeter();
        double r3Perm = r3.perimeter();
        System.out.println("r1 perimeter: "+ r1Perm + "\nr2 perimeter: "+r2Perm+ "\nr3 perimeter: "+r3Perm);
    }
}