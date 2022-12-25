public class StringTest 
{
    public static void main(String[] args)
    {
        String newStr = "Hey there what's up?";
        System.out.println("charAt(2): " + newStr.charAt(2));
        System.out.println("concat(nothing): " +  newStr.concat("nothing"));
        System.out.println("endsWith(up?)"+ newStr.endsWith("up?"));
        System.out.println("equals(whatever): "+ newStr.equals("whatever"));
        System.out.println("equalsIgnoreCase(hey there what'S UP?): "+ newStr.equalsIgnoreCase("hey there what'S UP?")); 
        System.out.println("hashCode(): "+ newStr.hashCode());
        System.out.println("isEmpty(): "+ newStr.isEmpty());
        System.out.println("indexof(w): "+newStr.indexOf('w'));
        System.out.println("indexOf(e,3): "+ newStr.indexOf('e',3));
        System.out.println("indexOf(what's): "+ newStr.indexOf("what's"));
        System.out.println("indexOf(Hey,4): "+ newStr.indexOf("Hey",4));
        System.out.println("lastIndexOf(e): "+ newStr.lastIndexOf('e'));
        System.out.println("lastIndexOf(e,6): "+ newStr.lastIndexOf('e',6));
        System.out.println("lastIndexOf(what's): "+ newStr.lastIndexOf("what's"));
        System.out.println("length(): "+ newStr.length());
        System.out.println("startsWith(Hey): "+ newStr.startsWith("Hey"));
        System.out.println("substring(4,20): "+ newStr.substring(4,20));
    }
}