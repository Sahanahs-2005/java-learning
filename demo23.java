enum Status
{
    Runnimg, Failed , Pending , Success
}
public class demo23
{
    public static void main(String[] args) {
        Status s[] = Status.values();
        for(Status ss:s)
        {
            System.out.println(ss +":"+ ss.ordinal());
        }
    }
}