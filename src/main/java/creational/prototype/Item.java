package creational.prototype;

public abstract class Item implements Cloneable {
    private int price;
    private String url;

    public Item(int price, String url) {
        this.price = price;
        this.url = url;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getPrice() {
        return price;
    }

    public String getUrl() {
        return url;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
