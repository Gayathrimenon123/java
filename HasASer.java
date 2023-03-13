import java.io.*;
public class HasASer
{
public static void main(String[] args)
{
Vehicle1 h=new Vehicle1("car");
try
{
FileOutputStream fos=new FileOutputStream("D:\\Car3.txt");
ObjectOutputStream ous=new ObjectOutputStream(fos);
ous.writeObject(h);
ous.close();
fos.close();
}
catch(IOException e)
{
System.out.println(e);
}
}
}
