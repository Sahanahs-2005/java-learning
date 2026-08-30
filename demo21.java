interface Computer
{
    void code();
}
class Desktop implements Computer
{
    @Override
    public void code()
    {
        System.out.println("code,compile,run:Faster");
    }
}
class Laptop implements Computer
{
    @Override
    public void code()
    {
        System.out.println("code,compile,run");
    }
}
class Developer
{
    public void DevApp(Computer lap)
    {
        lap.code();
    }
}
public class demo21
{
    public static void main(String[] args) {
        Computer desk = new Desktop();
        Computer lap = new Laptop();
        Developer navin = new Developer();
        navin.DevApp(desk);
        navin.DevApp(lap);
    }
}