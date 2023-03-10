package JDBCgms;
import java.sql.*;
public class delemp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			PreparedStatement pst=con.prepareStatement("delete emp1 where esal<?");
			pst.setInt(1,10000);
			int i=pst.executeUpdate();
            System.out.println("records updated " +i);
			con.close();
	}catch(Exception e) {
		System.out.println(e);
	}

	}

}
