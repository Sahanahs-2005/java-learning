interface A
{
    void show();
    void config();
}
interface X
{
    void run();
}
interface Y extends X
{

}
class B implements A,Y
{
    @Override
    public void show()
    {
        System.out.println("In show");
    }
    @Override
    public void config()
    {
        System.out.println("In config");

    }
    @Override
    public void run()
    {
        System.out.println("running..");
    }

}
public class demo22
{
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
        X obj1 = new B();
        obj1.run();
    }
}