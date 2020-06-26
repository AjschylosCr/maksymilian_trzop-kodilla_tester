public class Book {

    private String author;
    private String tittle;



    public static Book.of(String author, String tittle);{
        this.author = author;
        this.tittle = tittle;
    }

    public static void main (String[] args){
        Book book = new Book();
        Book book = Book.of(author, tittle);
    }
}