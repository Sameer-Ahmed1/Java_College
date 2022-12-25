public class Movie 
{
    private String title;
    private String director;
    private String leadCast;
    private int yearOfRelease;
    private double grossCollection;

    public Movie(String title, String director, double grossCollection)
    {
        this.title = title;
        this.director = director;
        this.grossCollection = grossCollection;
    }
    public Movie(String title, String director,String leadCast, int yearOfRelease, double grossCollection)
    {
        this(title,director,grossCollection);
        this.leadCast = leadCast;
        this.yearOfRelease = yearOfRelease;
    }

    public void getDetails()
    {
        System.out.println(this.title + "\n" + this.director + "\n" + this.leadCast +"\n"+ this.yearOfRelease + "\n" + this.grossCollection);
    }
}