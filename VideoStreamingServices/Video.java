package VideoStreamingServices;

public abstract class Video {
    private String title;
    private int duration; // in minutes

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
    public void setTitle(String title){
        if(title==null){
            System.err.println("Title cannot be null");
        }
        else{
            this.title=title;
        }
    }
    public void setDuration(int duration){
        if(duration<0){
            System.err.println("Duration cannot be less than 0 seconds");
        }
        else {
            this.duration=duration;
        }
    }
    public String getInfo() {
        return "Title: " + title +
                "\nDuration: " + duration + " minutes";
    }
}
