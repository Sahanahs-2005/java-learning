class A
{
    public A(){
        System.out.println("In a");
    }
    public A(int n){
        System.out.println("In a int");
    }
}
class B extends A
{
    public B(){
        System.out.println("In B");
    }
    public B(int n){
        this();
        System.out.println("In B int");
    }
    public void show()
    {
        System.out.println("In B show");
    }
}
public class demo14{
    public static void main(String[] args) {
        B obj = new B(5);
        obj.show();

        
    }
}
