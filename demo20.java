interface A
{
    void show();
    void config();
}
class B implements A
{
    @Override
    public void show()
    {
        System.out.println("In A show");
    }
    @Override
    public void config()
    {
        System.out.println("In config");
    }
}
public class demo20
{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();

    }
}