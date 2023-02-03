// s8 q2
import java.io.*;
class primeException extends Exception {
	String st;
	public primeException(String s)
	{
		st=s;
	}
	 public String toString(){ 
	return ("primeException Occurred: "+st) ;
	 }
}

// A Class that uses above MyException
public class primeexc {
	// Driver Program
	public static void main(String args[])
	{
		DataInputStream br=new DataInputStream(System.in);
		try {
		     int n,flag=0,i;
			 System.out.println("enter a number");
			 n=Integer.parseInt(br.readLine());
			 //n=3;
			 if(n==0||n==1)
				 flag=1;
             for (i = 2; i <= n / 2; ++i) {
				if (n % i == 0) {
				  flag = 1;
				  break;
				}
			 }			
			
			 if (flag == 0){
			throw new primeException("prime number is found");
			 }
			 else{
				 System.out.println("not a prime number");
			 }
		}
		catch (primeException e) {
			System.out.println("Caught");

			// Print the message from MyException object
			System.out.println(e);
		}
		catch(Exception e1){}
	}
}
