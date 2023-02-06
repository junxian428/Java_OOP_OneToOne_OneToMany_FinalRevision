public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;


    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;

    }

    public Book(String name, Author[] author, double price, int qty){
        this.name = name;
        this.authors = author;
        this.price = price;
        this.qty = qty;

    }

    public String getName(){
        return name;
    }

    public Author[] getAuthor(){
        return authors;
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
        String temp = "";
        for(Author author: authors){
            temp += name + " " + author.getName() + " " + author.getEmail() ;
        }
        return temp;
    }




}
