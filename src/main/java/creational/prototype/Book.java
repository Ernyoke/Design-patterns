package creational.prototype;

public class Book extends Item {
    private String title;

    public Book(String title, int price, String url) {
        super(price, url);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
