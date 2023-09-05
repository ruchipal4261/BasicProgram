public class LCM {
    public static void main(String[]args)
    {
        int x=8,y=12,z=16,m=18;
        int i;
        for(i=1;;i++)
        {
            if(i%x==0&&i%y==0&&i%z==0&&i%m==0)
            {
                break;
            }
        }
        System.out.println(i);
    }
    
}
