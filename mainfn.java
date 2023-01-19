import java.io.*;
class factorial {
 public int fact(int n)
	{if (n != 0)  
            return n * fact(n-1); 
        else
            return 1;
		}
}
class mainfn{
	public static void main(String args[])
	{
		int a;
		factorial f=new factorial();
		DataInputStream br = new DataInputStream(System.in);
		try{
		  System.out.println("Enter the no of terms ");
		  a = Integer.parseInt(br.readLine());
		  int res=f.fact(a);
		  System.out.print(res + " ");
		}catch(Exception e){}
	}
}
