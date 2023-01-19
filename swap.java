import java.io.*;
class swap
{
		public static void main(String args[])
	{
		int a,b,t;
		DataInputStream br=new DataInputStream(System.in);
		try{
			System.out.println("enter 1st number:");
			a=Integer.parseInt(br.readLine());
			System.out.println("enter 2nd number:");
			b=Integer.parseInt(br.readLine());
			System.out.println("before swapping..... ");
			System.out.println("a:"+a);
			System.out.println("b:"+b);
			t=a;
			a=b;
			b=t;
			System.out.println("after swapping..... ");
			System.out.println("a:"+a);
			System.out.println("b:"+b);
		}catch(Exception e){}
	}
}