public class main {

    public static void main(String [] args){
        String books [] = {"ToyStory1", "ToyStory2", "ToyStory3"};
        BookCollection lib = new  Library(books);

        Iterator itr = lib.createIterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
