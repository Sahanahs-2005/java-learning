class Demo
{
    public static void main(String args[])
    {
        /*int a=12;
        int b=5;
        int c = a++;
        int d = --b;
        boolean e=a>b;
        boolean f=a<=b;
        boolean g= a!=b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        int x=10;
        int y=30;
        int a=50;
        int b=70;
        boolean result =(x>y)||(a<b);
        System.out.println(!result);

        int x =18;
        if(x>28)
           System.out.println("Hello");
           else
              System.out.println("Bye");

              int x=8;
              int y=17;
              int z=9;
              if(x>y && x>z)
                System.out.println(x);
              else if(y>z)
                System.out.println(y);
              else
                System.out.println(z);

            int x=4;
            int y=7;
            int z=9;
            /*int result =0;
            if(n%2==0)
              result=10;
            else
                result=20;
            System.out.println(result);

            int result = ((x>y)&&(x>z))?x:((y>z)?y:z);
            System.out.println(result);


        int n = 2;
        switch(n)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }*/
       String day = "Sunday";
       String result = "";
       switch(day)
       {
              case "Monday"->System.out.println("Today is Monday");
                case "Tuesday"->System.out.println("Today is Tuesday");
                case "Wednesday"->System.out.println("Today is Wednesday");
                case "Thursday"->System.out.println("Today is Thursday");
               case "Friday"->System.out.println("Today is Friday");
                case "Saturday"->System.out.println("Today is Saturday");
                case "Sunday"->result="6am";
                default->System.out.println("Invalid day");
       }
            System.out.println(result);
    }
}