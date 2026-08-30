import tools.*;
public class demo13
{
    public static void main(String[] args) {
        AdvCalc ad = new AdvCalc();
        int r1= ad.add(1,3);
        int r2= ad.sub(4,1);
        int r3 = ad.mult(5,3);
        int r4 = ad.div(15,4);
        System.out.println(r1 +" "+r2+ " "+r3 +" "+r4);
    }
}
