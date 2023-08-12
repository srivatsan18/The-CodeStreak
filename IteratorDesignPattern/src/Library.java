public class Library implements  BookCollection{

    private String[] books;

    public Library (String[] booksCall){
        this.books = booksCall;
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(books);
    }
}
