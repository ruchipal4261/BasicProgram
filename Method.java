public class Method {
    static int sum(int a,int b)
    {
        return a+b;

    }
    public static void main(String[]args)
    {
        int r=sum(20,31);
        System.out.println(r);
        if(r%2==0)
        {
            System.out.println("Even sum");
        }
        else{
            System.out.println("Odd sum");
        }
    }
    
}
