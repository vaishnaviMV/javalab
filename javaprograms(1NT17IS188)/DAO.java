package jdbcjavap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO 
{
	
	public int insertemp(Employee e)//method to insert employee details
	{
		int r=0;
		Connection conn=new DBConnection().getDBconnection();
		try 
		{
			PreparedStatement pst=conn.prepareStatement("insert into Employee values(?,?,?,?)");//sql query to insert values into the database
			pst.setString(1, e.getName());//Sets the parameter to the given Java String value
			pst.setInt(2, e.getAge());//Sets the designated parameter to the given Java int value
			pst.setString(3, e.getDept());
			pst.setDouble(4, e.getSal());//Sets the designated parameter to the given Java Double value
			r=pst.executeUpdate();//execute sql statement
			
		} 
		catch (SQLException e1) 
		{
			e1.printStackTrace();
		}
		return r;
	}
	
	public int deleteemp(String emp)//method to delete specific employee details
	{
		int s=0;
		Connection conn=new DBConnection().getDBconnection();
		try 
		{
			PreparedStatement pst=conn.prepareStatement("delete from Employee where name=?");//sql query to delete a particular employee detail
			pst.setString(1, emp);
			s=pst.executeUpdate();
		} 
		catch (SQLException e1)
		{	
			e1.printStackTrace();
		}
		return s;
	}
	
	public void displayname(String ename)
	{
		Connection conn=new DBConnection().getDBconnection();
		try 
		{
				PreparedStatement pst = conn.prepareStatement("select * from Employee where name=?");//sql query to display details of particular employee
				pst.setString(1, ename);
				ResultSet rs=pst.executeQuery();
				while(rs.next())
				{
					System.out.println("Name : " +rs.getString(1)+ "\t"+  "Age : " +rs.getInt(2)+ "\t"+ "Dept :" +rs.getString(3)+ "\t"+ "Salary :" +rs.getDouble(4));;
				}
		}
		catch (SQLException e) 
		{
				e.printStackTrace();
		}
	
	}
	
	public void displayall()
	{
		Connection conn=new DBConnection().getDBconnection();
		try 
		{	
			PreparedStatement pst=conn.prepareStatement("select * from Employee");//query to display all details in employee table
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				System.out.println("Name : " +rs.getString(1)+ "\t"+  "Age : " +rs.getInt(2)+"\t"+ "Dept :" +rs.getString(3)+"\t" + "Salary :" +rs.getDouble(4));;
			}
		} 
		catch (SQLException e1) 
		{
			e1.printStackTrace();
		}
	}
}
