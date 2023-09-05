import java.util.Scanner;

public class Perfect {
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    for(int j=1; j<=500;j++){

    
    int n=j;
    int sum=0;
    int i=1;
    while(i<=n/2)
    {
        if(n%i==0)
        {
            sum=sum+i;

        }
        i++;
    }
    if(sum==n)
    {
        System.out.println("Perfect number"+j);

    }
    // else{
    //     System.out.println("Not Perfect number");
    // }
    }

}    
}
