import java.io.*;
public class HasADe
{
public static void main(String args[])
{
Vehicle1 h=null;
try
{
FileInputStream fis=new FileInputStream("D:\\Car3.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
h=(Vehicle1)ois.readObject();
h.disp();
ois.close();
fis.close();
}
catch(IOException e)
{
System.out.println(e);
}
catch(ClassNotFoundException e)
{
System.out.println(e);
}
}
}
