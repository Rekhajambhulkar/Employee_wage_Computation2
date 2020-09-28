public class EmployeeWage
{ 

//CONSTANTS
public static final int IS_Employee_Present=1;
public static final int Wage_Per_Hour=20;
public static final int Full_Time=1;
public static final Part_Time=0;

public static void main(String args[])
{

//variables
int totalHours=0;
int totalDays=0;

//Print the welcome Message
System.out.println("Welcome to the EmployeeWage Program");

//generate 0-2
double employeeCheck=Math.floor(Math.random()*10)%3;

if(IS_Employee_Present == employeeCheck)
{ 
	System.out.println("Employee is present");
}
else
{ 
	System.out.println("Employee is Absent");
}

}
}
