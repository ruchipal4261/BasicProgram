public class StringReverse {
    public static void main(String[]args)
    {
        String s="Java Program";
        char ch[]=s.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            System.out.println(ch[i]);
        }
    }
    
}
