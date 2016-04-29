import java.util.ArrayList;
import java.util.List;

/**
 * Created by Woo on 2016-04-29.
 */
public class BookShelf implements Aggregate {

    private List<Book> books;
    private int last = 0;
    public BookShelf(int initialsize) {
        this.books = new ArrayList<>(initialsize);
    }
    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(last, book);
        last++;
    }
    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
