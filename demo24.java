enum Laptop
{
    MacBook(2000) , XPS(2200) , Surface , Thinkpad(1800);
    private int price;
    private Laptop()
    {
        price = 2500;
    }
    private Laptop (int price)
    {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }   
}
public  class demo24
{
    public static void main(String[] args) {
        //Laptop lap = Laptop.MacBook;
        //System.out.println(lap);

        Laptop.MacBook.setPrice(5000);

        for(Laptop lap : Laptop.values())
        {
            System.out.println(lap +""+lap.getPrice());
        }

    }
}