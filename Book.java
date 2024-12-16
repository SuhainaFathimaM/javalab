public class Book {
    int accessionNumber;
    String title, author, publication;
    int edition;
    boolean isAvailable = true;

    public Book(int accessionNumber, String title, String author, String publication, int edition) {
        this.accessionNumber = accessionNumber;
        this.title = title;
        this.author = author;
        this.publication = publication;
        this.edition = edition;
        this.isAvailable = true;
    }

    public void displayDetails() {
        if(isAvailable)
        {
            System.out.println("Accession Number: " + accessionNumber);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Publication: " + publication);
            System.out.println("Edition: " + edition);
        }
        else{
            System.out.println("Book not available");
        }

        
    }
    public void buyBook()
        {
            System.out.println("You have bought the book. return in 15 days");
            isAvailable = false;
        }

        public void returnBook()
        {
            System.out.println("You have returned the book");
            isAvailable = true;
        }





    public static void main(String[] args) {
        Book book = new Book(101, "Java Programming", "Herbert Schildt", "McGraw Hill", 8);
        book.displayDetails();
        book.buyBook();
        book.displayDetails();
        book.returnBook();

        book.displayDetails();

    }
}
