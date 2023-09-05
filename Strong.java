public class Strong {
   public static int findFactorial(int n)
    {
         int fact=1;
         while(n>0)
         {
            fact=fact*n;
            n--;
         }
    }
    public static void main(String[]args){
    for(int i=1; i<100; i++)
    {
int n=145;
int sum=0;
int temp=n;
while(n>0)
{
    int r=n%10;
    int f=findFactorial(r);
    sum=sum+f;
    n=n/10;

}
if(sum==temp)
{
    System.out.println("Strong Number");
}
else{
    System.out.println("Not Strong number");
}
    }
    }    
}

