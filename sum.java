import java.io.*;
class sum
{
		public static void main(String args[])
	{
		int a,b;
		DataInputStream br=new DataInputStream(System.in);
		try{
			System.out.println("enter 1st number:");
			a=Integer.parseInt(br.readLine());
			System.out.println("enter 2nd number:");
			b=Integer.parseInt(br.readLine());
			System.out.println("Sum of "+a+" and "+b+" is "+(a+b));			
		}catch(Exception e){}
	}
}