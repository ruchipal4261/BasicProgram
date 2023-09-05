public class Program126 {
    public static void main(String[]args)
    {
        
        String s="Manmohan";
        char ch[]=s.toCharArray();
        String lower="";
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='A'&&ch[i]<='Z'){

            
            char c=(char)(ch[i]+32);
            lower=lower+c;
            }
            else {
                lower=lower+ch[i];
            }
        }
        System.out.println(lower);
    }
    
}
