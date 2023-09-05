
public class Program130 {
    public static void main(String[]args)
    {
        String s="Manmohan";
        char c[]=s.toCharArray();
        int temp[]=new int[c.length];
        for(int i=0;i<c.length;i++)
        {
            int count=1;
            for(int j=i+1;j<c.length;j++)
            {
                if(c[i]==c[j])
                {
                    count++;
                    temp[j]=-1;
                }
            }
            if(temp[i]!=-1)
            {
                System.out.println(c[i] +" "+count);
            }

        }
    }
    
}
