import java.io.*;
class sumof{
	static int n,s;
	sumof(int a){
		n=a;
	}
	static void sum(){
		try{
			int i;
			DataInputStream br=new DataInputStream(System.in);
			for(i=0;i<n;i++){
				if(i%2==0){
				s=s+i;
				}
			}
			System.out.println("sum :"+s);
		}catch(Exception e){}
	}
}
class evennumbers{
	public static void main(String args[]){
		int n;
		try{
			DataInputStream br=new DataInputStream(System.in);
			System.out.println("Enter limit:");
			 n=Integer.parseInt(br.readLine());
			sumof s1=new sumof(n);
			s1.sum();
		}catch(Exception e){}
	}
}