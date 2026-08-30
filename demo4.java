class Calculater{
    public int add(int a, int b){
        return a + b;
    }
    public int add(int a, int b,int c){
        return a +b+c;
    }
}
public class demo4{
    public static void main(String args[])
    {
        Calculater calc = new Calculater();
        int result1 = calc.add(10, 20);
        int result2 = calc.add(10, 20, 30);
        System.out.println(result1);
        System.out.println(result2);
    }
}