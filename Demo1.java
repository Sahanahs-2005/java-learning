class Demo1{
    public static void main(String[] args) {
        /*int i= 1;
        while(i<=4)
        {
            System.out.println("Hi"+i);
            i++;
        }*/
       for(int i=1;i<=4;i++)
        {
            System.out.println("Day"+i);
            for(int j=1;j<9;j++)
            {
                System.out.println(" "+(j+9)+(j+8));
            }
        }
    }
}