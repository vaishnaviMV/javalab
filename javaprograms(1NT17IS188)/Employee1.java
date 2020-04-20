package javalab;

import java.util.Date;
import java.util.Stack;

public class Employee1 
{
	public static void main(String[] args)
	{
		System.out.println("Enter Valid Employee ID : \n");
		int[] EmpId={1001,1002,1003,1004,1005,1006,1007};//initialize employee id array
		String[] EmpName={"Abc","Opqr","Ghi","Wxyz","Jklmn","Stuv","Def"};//initialize employee name array
		String[] JoinDate={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/01/2000","12/06/2006"};//initialize employee date of birth array
		char[] DesigCode={'e','c','k','r','m','e','c'};//initialize design code array
		String[] Department={"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};//initialize department array
		double[] Basic={20000,30000,10000,12000,50000,23000,29000};//initialize employee salary array
		double[] HRA={8000,12000,8000,6000,20000,9000,12000};//initialize hra array
		double[] IT={3000,9000,1000,2000,20000,4400,10000};//initialize it array
		char[] DesignationCode={'e','c','k','r','m'};//initialize designation code array
		String[] Designation={"Engineer","Consultant","Clerk","Receptionist","Manager"};//initialize designation array
		double[] DA={20000,32000,12000,15000,40000};//initialize da array
		int flag=0;//to check if id is found or not
		int id=Integer.parseInt(args[0]);//assign the id we have to find 
		
		for(int i=0;i<EmpId.length;i++)
		{
			if(EmpId[i]==id)
			{
				flag=1;// id found
				System.out.println("Emp Id.	 Emp Name	Department	Designation	   DA");
				System.out.print(EmpId[i]+" 	  "+EmpName[i]+" 		"+Department[i]);
				for(int j=0;j<DesignationCode.length;j++) 
				{
					if(DesigCode[i]==DesignationCode[j])//match desigcodes
					{	System.out.print(" 		"+Designation[j]+" 	");//print designation
						double sum=Basic[i]+HRA[i]+DA[j]-IT[i];//calculate salary
						System.out.print(sum);// print salary
					}
				}		
			}	
		}
		if(flag==0)//invalid employee id
			System.out.println("There is no employee with EmpId : " +id);
	}
}
