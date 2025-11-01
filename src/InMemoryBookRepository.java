import java.util.ArrayList;
import java.util.List;

public abstract class InMemoryBookRepository implements BookRepository{
    private final List<Book> books = new ArrayList<>();

    @Override
    public void add(Book book) {
        books.add(book);
    }

    @Override
    public Book findBookId(int id) {
        return books.stream() // Converts arraylist into stream which is sequence of elements you can process in a functional style
                .filter(b->b.getBookID()==id) //find where the bookId = id.equivalent to if statement in the findBookId method
                .findFirst() // return the first element in the filtered stream
                .orElse(null); // no book return null
    }

    @Override
    public List<Book> viewAll() {
        return new ArrayList<>(books);
    }

}
