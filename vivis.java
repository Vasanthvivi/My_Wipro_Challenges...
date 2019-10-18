import java.util.*;
class vivis
{
public static void main(String args[])throws Exception
{
String in;
StringBuilder c=new StringBuilder();
StringBuilder b=new StringBuilder();
Scanner s=new Scanner(System.in);
char e[]=new char[20];
char f[]=new char[20];
System.out.println("Enter the String");
in=s.next();
StringBuilder a=new StringBuilder(in);
String rev=new String(a.reverse());
e=in.toCharArray(); 
f=rev.toCharArray();
int count=0;
for(int i=0;i<in.length();i++)                         
{
if(e[i]!=f[i])
{
count++;
}
}
System.out.println(count);
}
}
