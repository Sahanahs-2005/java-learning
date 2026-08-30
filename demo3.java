class Computer{
    public void playMusic(){
        System.out.println("Playing music");
    }
    public String getMePen(int cost){
        if(cost>10)
            return "Pencil";
        else
        return "Pen";
    }
}
public class demo3
{
    public static void main(String args[])
    {
        Computer comp = new Computer();
        comp.playMusic();
        String item=comp.getMePen(10);
        System.out.println(item);

    }  
}