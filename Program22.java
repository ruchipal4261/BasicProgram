import java.util.Scanner;
public class Program22 {
public static void main(String[]args)
{
    int count=0;
    System.out.println("Enter the number");
    int num=sc.nextInt();
    while(num!=0){
        num=num/10;
        count++;

    }
System.out.println("Number of digit"+count );
}
    
}
