import java.io.*;
class max
{
		public static void main(String args[])
	{
		int a,b,c;
		DataInputStream br=new DataInputStream(System.in);
		try{
			System.out.println("enter 1st number:");
			a=Integer.parseInt(br.readLine());
			System.out.println("enter 2nd number:");
			b=Integer.parseInt(br.readLine());
			System.out.println("enter 3rd number:");
			c=Integer.parseInt(br.readLine());
			if(a<b){
				if(b<c){
					System.out.println(c+" is the greatest number");
				}
				else{
					System.out.println(b+" is the greatest number");
				}
			}
				else{
				if(a<c){
					System.out.println(c+" is the greatest number");
				}
				else{
					System.out.println(a+" is the greatest number");
				}
			}				
		}catch(Exception e){}
	}
}