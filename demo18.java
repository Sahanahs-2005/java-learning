class A
{
    int marks=1;;
    public void show()
    {
        System.out.println("In A show");
    }
    static class B
    {
        public void config()
        {
            System.out.println("In config");
        }
    }
}
public class demo18
{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = new A.B();
        obj1.config();

        System.out.println(obj.marks);
    }
}