class Human
{
    private String name;
    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}
public class demo10
{
    public static void main(String[] args)
    {
        Human h1= new Human();
        h1.setName("John");
        h1.setAge(25);

        System.out.println("Name: "+h1.getName()+" Age: "+h1.getAge());
    }
}