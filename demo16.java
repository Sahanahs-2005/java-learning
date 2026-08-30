class A
{
    public void show1()
    {
        System.out.println("In A show");
    }
}
class B extends A
{
    public void show2()
    {
        System.out.println("In B show");
    }
}
public class demo16
{
    public static void main(String[] args) {
        A obj = new B();
        obj.show1();

        B obj2=new B();
        obj2.show2();

        B obj1 = (B) obj;
        obj1.show1();
    }
}