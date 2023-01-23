import java.io.*;
import combination.*;
import java.lang.Math;
class comb{
	public static void main(String args[]){
		try{
			c1 c=new c1();
			DataInputStream br=new DataInputStream(System.in);
			System.out.println("enter n:");
			int n=Integer.parseInt(br.readLine());
			System.out.println("enter r:");
			int r=Integer.parseInt(br.readLine());
			c.value(n,r);
		}catch(Exception e){}
	}
}