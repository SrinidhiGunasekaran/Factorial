import java.io.*;
class Factorial
{
public static void main(String args[])
{
int a;
try
{
DataInputStream in=new DataInputStream(System.in);
a=Integer.parseInt(in.readLine());
System.out.println("Factorial is:"+fact(a));
}
catch(Exception e)
{
}
}
static int fact(int a)
{
if(a==0)
{
return 1;
}
else
{
return(a*fact(a-1));
}
}
}
