package jdbcjavap;

public class Employee 
{
	String name;
	int age;
	String dept;
	double sal;
	public String getName() 
	{
		return name;//return employee name
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;//return age
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getDept() 
	{
		return dept;//return department
	}
	public void setDept(String dept) 
	{
		this.dept = dept;
	}
	public double getSal() 
	{
		return sal;//return salary
	}
	public void setSal(double sal) 
	{
		this.sal = sal;
	}
}


