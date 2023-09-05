public class Pattern1 {
    public static void main(String[]args)
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                // if(i==j||i+j==n-1)
                if(j==0||i==0||i==n/2||j==n-1)
                System.out.println("A");
            
            else
            System.out.println(" *");
        }
        System.out.println();
    }
}   
}
