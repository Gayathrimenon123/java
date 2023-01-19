import java.io.*;
class max1
{
		public static void main(String args[])
	{
		int a,b,c,d;
		DataInputStream br=new DataInputStream(System.in);
		try{
			System.out.println("enter 1st number:");
			a=Integer.parseInt(br.readLine());
			System.out.println("enter 2nd number:");
			b=Integer.parseInt(br.readLine());
			System.out.println("enter 3rd number:");
			c=Integer.parseInt(br.readLine());
			d=c>(a>b?a:b)?c:((a>b)?a:b);
			System.out.println(d+" is the greatest number");
		}catch(Exception e){}
	}
}