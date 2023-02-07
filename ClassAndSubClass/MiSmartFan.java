public class MiSmartFan extends Fan{
    private String brand;
    private int weight;
    private String type;
    double price;

    public String getString(){
        return this.brand;
    }

    public int getWeight(){
        return this.weight;
    }

    public String getType(){
        return this.type;
    }

    public double getPrice(){
        return this.price;
    }


    //

    public void setString(String brand){
        this.brand = brand;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setType(String type){
        this.type = type;
    }


    public void setPrice(double price){
        this.price = price;
    }



    public MiSmartFan(){
        this("Xiao Mi", 3 , "Stand Fans", 249.90);
    }


    public MiSmartFan(String brand, int weight, String type, double price){
        super(SLOW,false,5,"BLUE");
        this.brand = brand;
        this.weight = weight;
        this.type = type;
        this.price = price;
    }


    public MiSmartFan(String brand, int weight, String type, double price, int speed, boolean on, double radius, String color){
        super(speed, on , radius, color);
        this.brand = brand;
        this.weight = weight;
        this.type = type;
        this.price = price;
    }

    public String toString(){
        return super.toString() +
        "\nBrand " + this.brand +
        "\n Weight" + this.weight + 
        "\n Type " + this.type +
        "\n Price " + this.price;
    }
}