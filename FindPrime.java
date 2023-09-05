public class FindPrime {
    public static  boolean findPrime(int n) 
    {
        int i=2;
        int count=0;
        while(i<=n/2)
        {
            if(n%i==0)
            count++;
            i++;

        }
       if (count==0)
        return true;
        else
        return false;

    }
    public static void main(String[]args)
    {
if(findPrime(7)==true)
{
    System.out.println("Prime Number");
}
else{
    System.out.println(" Not Prime Number");
}
    }
    
}
