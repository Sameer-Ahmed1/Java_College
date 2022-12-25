public class MovieTest 
{
    public static void main(String[] args)
    {
        Movie m1 = new Movie("Apocalypse now", "Francis Ford Coppola",100000.3);
        Movie m2 = new Movie("Godfather","Martin Scorcese","Al Pacino",1972, 534324.34);
       System.out.println("m1: ");
       m1.getDetails();
       System.out.println("\nm2: ");
       m2.getDetails();


    }
}