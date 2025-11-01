public class Book {
    private int bookID;
    private String title;
    private String author;
    private boolean isAvailable;
    private String borrowerName;
    private String dueDate;

    public Book(int bookID,String title,String author){
        this.bookID=bookID;
        this.title=title;
        this.author=author;
        this.isAvailable=true;
        this.borrowerName=null;
        this.dueDate=null;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    @Override
    public String toString(){
        return "Book ID : "+bookID+
                ", Book Title : "+title+
                ", Author : "+author +
                ", Available : "+isAvailable + (isAvailable ? "": ", Borrower Name : "+borrowerName +", Due date : "+dueDate) + "\n";
    }
}
