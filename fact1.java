

public class fact1 {
    public static void main(String[]args)
    {
    int n=23456;
    while(n>0)
    {
        int r=n%10;
        int fact=1;
        while(r>0)
        {
            fact=fact*r;
r--;
        }
        System.out.println(fact);
        n=n/10;
    }
    }


}
