import java.io.*;
class ht{
int feet;
float inch;
public void read(){
	DataInputStream br=new DataInputStream(System.in);
	try{
		System.out.println("enter feet and inch:");
    	feet=Integer.parseInt(br.readLine());
		inch=Float.parseFloast(br.readLine());
		}catch(Exception e){}
}
public void disp(){
	System.out.println("height:"+feet+inch);
}
public void add(ht h2){
	ht h3=new ht();
	h3.feet=h1.feet+h2.feet;
	h3.inch=h1.inch+h2.inch;
	while (h3.inch >= 12.0) {
      h3.inch = h3.inch - 12.0;
      ++h3.feet;
	}
	System.out.println("height:"+h3.feet+h3.inch);
}
//public void multi(){

//}
}
class height{
public static void main(String args[]){
	ht h1=new ht();
	ht h2=new ht();
	h1.read();
	h2.read();
	h1.disp();
	h2.disp();
	h1.add(h2);
	//h.mult();
}
}