public class Reverse {
    public static void main(String[]args)
{
    int n=23456;
    int rev=0;
    while(n>0)
    {
        int r=n%10;
        rev=rev*10+r;
        n=n/10;

    }
    System.out.println(rev);
}    
}
