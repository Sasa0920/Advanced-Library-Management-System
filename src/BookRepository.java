import java.util.List;

public interface BookRepository {
    void add(Book book);
    Book findBookId(int id);
    List<Book> viewAll();

}
