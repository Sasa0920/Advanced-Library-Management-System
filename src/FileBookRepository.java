import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileBookRepository implements PersistentBookRepository {
    private final File file = new File("Library Books.txt");
    private final List<Book> books = new ArrayList<>();

    @Override
    public void add(Book book) {
        books.add(book);
    }

    @Override
    public Book findBookId(int id) {
        return books.stream() // Converts arraylist into stream which is sequence of elements you can process in a functional style
                .filter(b -> b.getBookID() == id) //find where the bookId = id.equivalent to if statement in the findBookId method
                .findFirst() // return the first element in the filtered stream
                .orElse(null); // no book return null
    }

    @Override
    public List<Book> viewAll() {
        return new ArrayList<>(books);
    }

    @Override
    public void saveAll(List<Book> books) throws Exception {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Book b : books) {
                writer.write(b.getBookID() + "," +
                        b.getTitle() + "," +
                        b.getAuthor() + "," +
                        b.isAvailable() + "," + (b.getBorrowerName() == null ? "null" : b.getBorrowerName()) + "," + (b.getDueDate() == null ? "null" : b.getDueDate()
                ));
                writer.newLine();
            }
            writer.close();
            System.out.println("Books save to file successfully");

        }
    }

    @Override
    public List<Book> readAll() throws Exception {
       List<Book> readBooks = new ArrayList<>();
       if(!file.exists()) return  readBooks;
       try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
           String line;
           while ((line = reader.readLine()) != null) {
               String[] parts = line.split(",");
               if (parts.length < 6) {
                   System.out.println("Skipping invalid line: " + line);
                   continue;
               }

               int id = Integer.parseInt(parts[0]);
               String title = parts[1];
               String author = parts[2];
               boolean available = Boolean.parseBoolean(parts[3]);
               String borrower = parts[4].equals("null") ? null : parts[4];
               String dueDate = parts[5].equals("null") ? null : parts[5];

               Book book = new Book(id, title, author);
               book.setAvailable(available);
               book.setBorrowerName(borrower);
               book.setDueDate(dueDate);

               readBooks.add(book);
           }
       }

       System.out.println("Books read from file successfully");
       books.clear();
       books.addAll(readBooks);
       return readBooks;
    }
}
