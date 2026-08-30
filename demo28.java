import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;
public class demo28
{
    public static void main(String args[]) throws IOException,NumberFormatException
    {
        /*System.out.println("Enter the number");
        int num = System.in.read();
        System.out.println(num-48); 

        System.out.println("Enter a number");
        try(InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);)
        {
        int num =Integer.parseInt(br.readLine());
        System.out.println(num);
        }*/
       System.out.println("Enter a number");
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       System.out.println(num);
    }
}