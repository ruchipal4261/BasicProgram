public class Program {
    public static void main(String[]args)
    {
        int a=20;
        int b=30;
        System.out.println(a+"Before swapping"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+"After swapping"+b);
    }
}
