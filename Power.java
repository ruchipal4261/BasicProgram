import java.util.Scanner;

public class Power {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base");
        int base =sc.nextInt();
        System.out.println("Enter the expontent");
        int exp=sc.nextInt();
        int pow=1;
        while(exp>0)
        {
            pow=pow*base;
            exp--;

        }
        System.out.println(pow);
    }
    
}
