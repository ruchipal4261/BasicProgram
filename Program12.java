public class Program12 {
    public static void PrintPrime(){
   
        for(int j=2; j<=50;j++)
        {
            int n=j;
            int i=2;
            int count=0;
            while(i<=n/2)
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
            
        }
        }
        

public static void main(String[]args){
    PrintPrime();
}
}