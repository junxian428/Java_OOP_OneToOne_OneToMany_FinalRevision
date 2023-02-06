public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Author author1 = new Author("Tan Ah Teck", "ahteck@nowhere.com",'m');
        Author author2 = new Author("Ho Weng Yin", "ho@nowhere.com",'m');
        Author[] dummyAuthors = new Author[2];
        dummyAuthors[0] = author1;
        dummyAuthors[1] = author2;
        System.out.println(author1.toString());
        System.out.println(author1.getName());
        System.out.println(author1.getGender());


        Book book = new Book("Hello World" , dummyAuthors, 31.0);
        System.out.println(book.getAuthor());
        System.out.println(book);
        System.out.println(book.getName());
        System.out.println(book.getPrice());
        

    }
}
