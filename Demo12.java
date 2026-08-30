class A
{
    public void show()
    {
        System.out.println("In a show ");
    }
}
class B extends A{
    @Override
    public void show()
    {
        System.out.println("In B show");
    }
}
public class Demo12
{
    public static void main(String args[])
    {
        B b=new B();
        b.show();

       

    }
}