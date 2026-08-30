abstract class A
{
    public abstract void show();
}
public class demo19
{
    public static void main(String[] args) {
        A obj = new A()
        {
            @Override
            public void show()
    {
        System.out.println("In new show");
    }
        };
        obj.show();
    }
}