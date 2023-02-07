public class Fan {
    
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed;

    private boolean on;
    private double radius;
    String color;

    public int getSpeed(){
        return this.speed;
    }

    public boolean getOn(){
        return this.on;
    }

    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void setOn(boolean on){
        this.on = on;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public Fan(){
        this(SLOW,false,5,"BLUE");
        //this.speed = SLOW;
    }

    public Fan(int speed, boolean on, double radius,String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String toString(){
        if(this.on){
            return "Speed = " + this.speed + 
            "\n Color: "  + this.color +
            "\n Radius: " + this.radius;
        } else{
            return
            "\n Color: "  + this.color +
            "\n Radius: " + this.radius +
            "\nFan is off";
        }
    }



}
