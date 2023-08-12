public class BookIterator implements Iterator{
    private String books [];
    private int pos =0;

    public BookIterator (String [] books){
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return  pos < books.length;
    }

    @Override
    public Object next() {
        if(hasNext()){
            return  books[pos++];
        }
        return null;
    }
}
