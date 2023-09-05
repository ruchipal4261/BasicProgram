public class PrimeNumber {
    public static void main(String[]args){
    for(int j=2; j<=50;j++)
    {
        int n=j;
        int i=2;
        int count=0;
        while(i<n/2)
        {
            if(n%i==0)
            {
                count++;
            }
            i++;
        }
        if(count==0)
        {
            System.out.println("Prime Number"+j);

        }
        // else{
        //     System.out.println("Not Prime Number");
        // }
    }
    }
    
}
