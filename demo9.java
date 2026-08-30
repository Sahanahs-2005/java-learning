class Mobile
{
    String brand;
    int price;
    static String name;

    static
    {
        name= "SmartPhone";
        System.out.println("Static block executed");
    }
    public Mobile(){
        brand=" ";
        price=200;
        System.out.println("Constructor executed");
    }
    public void show()
    {
        System.out.println("Brand: "+brand+" Price: "+price+" Name: "+name);
    }
}
public class demo9
{
    public static void main(String[] args)throws ClassNotFoundException{
       /*Mobile m1= new Mobile();
       m1.brand="Samsung";
       m1.price=300;
       Mobile.name="SmartPhone";

       Mobile m2= new Mobile();

       m1.show();
         m2.show();*/
         
         Class.forName("Mobile");

    }
}
