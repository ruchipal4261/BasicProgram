public class StringPalidrom {
    public static void main(String[]args)
    {
        String s="Java Program";
        char ch[]=s.toCharArray();
        String rev="";
        
        for(int i=ch.length-1;i>=0;i--)
        {rev=rev+ch[i];
        }
        if(rev.equals(s))
        System.out.println("Palidrome Number");
        else
        System.out.println("Not Palidrome Number");
    }
    
}
