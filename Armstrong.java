public class Armstrong {

static int FindCount(int n){
int count=0;
while(n>0)
count++;
n=n/10;

}
  return Count;

}
static int FindPower (int base ,int exp)
{
int pow=1;
while(exp>0)
{
    pow=pow*base;
    exp--;
}
return pow;
}
public static void main(String[]args)
{
  for(int i=1;i<1000;i++)
  {
    int n=i;
    int c=FindCount(n);
    int sum=0;
    int temp=n;
while(n>0)
{
    int r=n%10;
    int p=FindPower(r,c);
    sum=sum+p;
    n=n/10;
}
if(sum==temp)
{
    System.out.println("Armstrong Number");
}
else{
    System.out.println("Not Armstrong Number");
}
  } 
        }

    


  
        