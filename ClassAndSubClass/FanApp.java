public class FanApp{


    public static void main(String[] args){
        Fan fan1 = new Fan(3,true , 10, "Yellow");
        Fan fan2 = new Fan(2,false, 5, "BLUE");


        MiSmartFan mi1 = new MiSmartFan();
        MiSmartFan mi2 = new MiSmartFan("",5, "BLUE", 399.90, 3,true, 10, "White");


        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        System.out.println(mi1.toString());

        System.out.println(mi2.toString());

    }
}