package combination;
public class c1{
	public static void value(int n,int r){
		int res=1;
		for(int i=1;i<=n;i++)
			res=res*i;
	int result=res/n*(n-r);
	System.out.println("result:"+result);
 }
}