public class Sum {
    public static void main(String[]args){

    
    int n=145;
    int sum=0;
    int temp=n;
    while(n>0)
    {
        int r=n%10;
        int fact =1;
        while(r>0)
        {
            fact=fact*r;
            r--;

        }
        sum=sum+fact;
        n=n%10;
    }
    if(sum==temp)
    {
        System.out.println("Strong Number");
    }
    else{
        System.out.println("Not Strong Number");
    }
   
    }

}
