import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PersistentBookRepository repository = new FileBookRepository();
        LibraryService service = new LibraryService(repository);

        while(true){
            System.out.println("1. Add Book");
            System.out.println("2. View Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Save To File");
            System.out.println("6. Read From File");
            System.out.println("7. Exit");

            System.out.print("Choose an option : ");

            int optionNumber = sc.nextInt();
            sc.nextLine();

            switch (optionNumber) {
                case 1 -> {
                    System.out.print("Book ID : ");
                    int ID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Title of the book : ");
                    String title = sc.nextLine();

                    System.out.print("Author's name : ");
                    String name = sc.nextLine();

                    Book book = new Book(ID,title,name);
                    service.addBook(book);
                }
                case 2 -> service.getAllBooks().forEach(System.out::println);
                case 3 -> {

                    System.out.print("Enter thr book ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter the borrower name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter the due date : ");
                    String date = sc.nextLine();

                    service.borrowBook(id,name,date);
                }
                case 4 -> {
                    System.out.print("Enter the book ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    service.returnBook(id);
                }
                case 5 -> {
                    repository.saveAll(service.getAllBooks());
                }
                case 6 -> {
                    repository.readAll();
                }
                case 7 -> {
                    System.out.println("Thank you...Exiting");
                    System.exit(0);
                }
                default -> System.out.println("Please enter a correct option number.");
            }

        }

    }
}