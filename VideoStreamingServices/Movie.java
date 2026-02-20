package VideoStreamingServices;

public class Movie extends Video{
    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }
    public void setRating(double rating){
        if(rating<0 || rating>10){
            System.err.println("The rating cannot be under 0 or more than 10");
        }
        else {
            this.rating=rating;
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nRating: " + rating;
    }
}
