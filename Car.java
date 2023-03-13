import java.io.*;
public class Car extends Vehicle
{
public String comp;
public Car(String name,int id,String comp)
{
super(name,id);
this.comp=comp;
}
public void disp()
{
super.disp();
System.out.println("comp="+comp);
}
}
