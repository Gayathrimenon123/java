import java.io.*;
public class Engine implements Serializable
{
public int id;
public Engine(int id)
{
this.id=id;
}
public void disp()
{
System.out.println("id="+id);
}
}
