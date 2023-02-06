public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Author author1 = new Author("Tan Ah Teck", "ahteck@nowhere.com",'m');
        System.out.println(author1.toString());
        System.out.println(author1.getName());
        System.out.println(author1.getGender());


        Book book = new Book("Hello World" , author1, 31.0);
        System.out.println(book.getAuthor());
        System.out.println(book);
        System.out.println(book.getName());
        System.out.println(book.getPrice());
        

    }
}
