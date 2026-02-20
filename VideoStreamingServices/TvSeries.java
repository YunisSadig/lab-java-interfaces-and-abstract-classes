package VideoStreamingServices;

public class TvSeries extends Video{
    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }
    public void setEpisodes(int episodes){
        if(episodes<0){
            System.err.println("The number of episodes cannot be under 0");
        }
        else{
            this.episodes=episodes;
        }
    }
    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nEpisodes: " + episodes;
    }
}
