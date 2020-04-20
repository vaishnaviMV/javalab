package jdbcjavap;

import java.util.Scanner;

public class FinalDBProgram 
{
	public static void main(String[] args) 
	{
		for( ; ; )
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("\n 1. Insert Emp \n 2. Delete Emp \n 3. Display Acc to Name \n 4. Display All \n 5. Exit \n");//asking user to enter choices
			System.out.println("Enter your choice");
			int n=sc.nextInt();
			
			Employee e=new Employee();//object of class Employee
			DAO d=new DAO();//object of class DAO
			
			switch(n)
			{
			case 1:
					System.out.println("Enter the Employee Name : ");
					e.setName(sc.next());
					System.out.println("Enter the Age : ");
					e.setAge(sc.nextInt());
					System.out.println("Enter the Dept : ");
					e.setDept(sc.next());
					System.out.println("Enter the Salary : ");
					e.setSal(sc.nextDouble());
					d.insertemp(e);
					System.out.println("Employee added successfully");
					break;
			case 2:
					System.out.println("Enter the employee name : ");
					String Newname=sc.next();
					d.deleteemp(Newname);
					System.out.println("Employee deleeted successfully");
					break;
			case 3:System.out.println("Enter the Employee name to display its attributes : ");
					String ename=sc.next();
					System.out.println("Employee details...");
					d.displayname(ename);		
					break;
			case 4:System.out.println("Employee deatils are as follows...");
					d.displayall();
					break;
			case 5:System.exit(0);
					break;
					default:
						System.out.println("Please Choose Valid option \n");
						break;
			}
		}
	}
}
