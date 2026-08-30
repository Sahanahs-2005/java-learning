class Human
{
    int age;
    String name;
    public Human()
    {
        age=0;
        name="A";
    }
    public Human(String name)
    {
        this.name = name;
        age=10;
    }
    public Human(int age,String name)
    {
        this.age = age;
        this.name = name;
    }

   
}
public class demo11
{
    public static void main(String args[])
    {
        Human h1 = new Human();
        Human h2 = new Human("B");
        Human h3 = new Human(20,"C");
        System.out.println(h1.name+" "+h1.age);
        System.out.println(h2.name+" "+h2.age);
        System.out.println(h3.name+" "+h3.age);
    }
}