import java.util.List;

public interface PersistentBookRepository extends BookRepository {
    void saveAll(List<Book> books)throws Exception;
    List<Book> readAll() throws Exception;
}
