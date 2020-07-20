import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExamples
{
	Connection con;
	Statement st;
	PreparedStatement p;
	CallableStatement cs;
	ResultSet rs;
	
	
	public void StatementExample()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MySession","root","root");
			st=con.createStatement();
			st.execute("insert into Learning values('java',1002)");
		}
		catch(Exception ex)
		{
			
		}
	}
	public void PreparedStatementExample()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MySession","root","root");
			p=con.prepareStatement("insert into Learning values(?,?)");
			p.setString(1, "");
			p.setInt(2, 1002);
			p.executeUpdate();
		}
		catch(Exception ex)
		{
			
		}
	}
	
	public void CallableStatement()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MySession","root","root");
			CallableStatement cs=con.prepareCall("{CALL mp1}");
			cs.execute();
		}
		catch(Exception ex)
		{
			
		}
	}
	public void DisplayValuesWithResultSet()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MySession","root","root");
			st=con.createStatement();
			rs=st.executeQuery("select * from Learning");
			
			while(rs.next())
			{
			  System.out.println(rs.getString(1)+"        "+rs.getInt(2));
			}
			
		}
		catch(Exception ex)
		{
			
		}
	}
	

	public void DisplayValuesWithScrollableResultSet()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MySession","root","root");
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs=st.executeQuery("select * from Learning");
			
			rs.absolute(2);
			System.out.println(rs.getString(1)+"        "+rs.getInt(2));
			
		}
		catch(Exception ex)
		{
			
		}
	}
    

	
	public void UpdateValuesWithUpdatableResultSet()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MySession","root","root");
			st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=st.executeQuery("select * from Learning");
			rs.absolute(1);
			rs.updateInt(2, 1006);
			rs.updateRow();
			
		}
		catch(Exception ex)
		{
			
		}
	}

	
	
	
	public static void main(String args[])
	{
		JDBCExamples je=new JDBCExamples();
		je.StatementExample();
		je.PreparedStatementExample();
		je.CallableStatement();
		je.DisplayValuesWithResultSet();
		je.DisplayValuesWithScrollableResultSet();
		je.UpdateValuesWithUpdatableResultSet();
	}

}
