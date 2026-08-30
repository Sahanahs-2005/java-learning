class Mobile
{
    String brand;
    int price;
    static String name;
    public void show()
    {
        System.out.println("Brand: "+brand+" Price: "+price+" Name: "+name);
    }
    public static void show1(Mobile m)
    {
        System.out.println("Brand: "+m.brand+"Price: "+m.price+" Name: "+name);
    }
}
public class demo8
{
    public static void main(String[] args) {
       Mobile m1= new Mobile();
       m1.brand = "Samsung";
         m1.price = 20000;
         Mobile.name = "SmartPhone";

         Mobile m2= new Mobile();
            m2.brand = "Apple";
            m2.price = 80000;
            Mobile.name = "SmartPhone";

            m1.show();
            m2.show();
            Mobile.show1(m1);
    }
}