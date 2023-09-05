public class StringSplitReverse {
 
    public static void main(String[]args)
    {
        String s="Java is a Programming Language";
        String s1[]=s.split(" ");
        for(String s2:s1)
        {
            String rev="";
            char c[]=s2.toCharArray();
            // for(int i=0;i<c.length;i++){
            //     rev=c[i]+rev;
            for(int i=c.length-1;i>=0;i--);{
                rev=c[i]+rev;

            }
            System.out.print(rev+" ");
        }
    }
}
