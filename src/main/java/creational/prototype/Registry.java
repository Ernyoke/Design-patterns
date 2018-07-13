package creational.prototype;

import java.util.HashMap;

public class Registry {
    private HashMap<Class<? extends Item>, Item> items = new HashMap<Class<? extends Item>, Item>();

    public Registry() {
        loadItems();
    }

    public Item createItem(Class<? extends Item> type) {
        Item item = null;
        try {
            item = (Item)(items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie("Silence of the lambdas", 240, 20, "http://url.movie");
        items.put(Movie.class, movie);

        Book book = new Book("Assertive Java", 156, "http://url.book");
        items.put(Book.class, book);
    }
}
