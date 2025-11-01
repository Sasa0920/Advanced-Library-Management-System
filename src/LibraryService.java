import java.util.List;

public class LibraryService {
    private final BookRepository repository;
    public LibraryService(BookRepository repository){
        this.repository=repository;
    }
    public void addBook(Book book){
        if(repository.findBookId(book.getBookID())!=null){
            System.out.println("Book ID already exists!");
            return;
        }
        repository.add(book);
        System.out.println("Book Added Successfully.");
    }
    public void borrowBook(int id,String borrower,String date){
        Book book = repository.findBookId(id);
        if(book==null){
            System.out.println("No book with that ID.");
            return;
        }
        if(book.isAvailable()){
            book.setAvailable(false);
            book.setBorrowerName(borrower);
            book.setDueDate(date);
            System.out.println("Book borrowed successfully.");
        }
        else{
            System.out.println("Book is already borrowed");
        }
    }
    public void returnBook(int id){
        Book book = repository.findBookId(id);
        if(book==null){
            System.out.println("No book with that ID.");
            return;
        }
        if(!book.isAvailable()){
            book.setAvailable(true);
            book.setBorrowerName(null);
            book.setDueDate(null);
            System.out.println("Book returned successfully.");
        }
        else{
            System.out.println("Book is not borrowed");
        }
    }
    public List<Book> getAllBooks(){
        return repository.viewAll();
    }

}
