public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty = 0;


    public Book(String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;

    }

    public Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;

    }

    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public int qty(){
        return qty;
    }


    public void setPrice(double price){
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }


    @Override
    public String toString(){
        return " "+ name + " " + author.getName() + " " + author.getEmail() ;
    }




}
