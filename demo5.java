public class demo5
{
    public static void main(String args[])
    {
       /* int num[]=new int[5];
        num[3]=40;
        num[0]=10;
        num[1]=20;
        num[2]=30;
        num[4]=50;
        for(int i=0;i<5;i++)
        {
            System.out.print(num[i]+" ");
        }*/
       int nums[][]=new int[3][];
       nums[0]=new int[3];
         nums[1]=new int[4];
         nums[2]=new int[2];

       for(int i=0;i<3;i++)
       {
           for(int j=0;j<nums[i].length;j++)
           {
               nums[i][j]=(int)(Math.random()*10);
           }
       }
      
       for( int n[]:nums)
       {
        for(int m:n)
        {
            System.out.print(m+" ");
        }
        System.out.println();
       }
    }
}