package creational.prototype;

public class Movie extends Item {
    private String title;
    private int duration;

    public Movie(String title, int duration, int price, String url) {
        super(price, url);
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
