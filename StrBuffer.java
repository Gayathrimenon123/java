import java.io.*;
public class StrBuffer {
	public static void main(String args[]){ 
		StringBuffer s=new StringBuffer("hello"); 
		System.out.println(s.capacity());
		s.append(" gayathri");
		System.out.println(s);
		System.out.println(s.capacity());
		s.append("menon"); 
		//System.out.println(s.capacity());
		s.insert(13,"s");
		System.out.println(s);
		s.replace(1,3,"aii"); 
		System.out.println(s);
		s.delete(0,7); 
		System.out.println(s);
		s.reverse(); 
		System.out.println(s);
		}	
 }