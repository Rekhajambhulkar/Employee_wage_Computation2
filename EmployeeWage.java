public class EmployeeWage
{ 

//CONSTANTS
public static final int IS_Employee_Present=1;
public static final int Wage_Per_Hour=20;
public static final int Full_Time=1;
public static final int Part_Time=0;
public static final int WorkingDay_Per_Month=20;

public static void main(String args[])
{

//variables
int totalHours=0;
int totalDays=0;

//Print the welcome Message
System.out.println("Welcome to the EmployeeWage Program");

//generate 0-2
double employeeCheck=Math.floor(Math.random()*10)%3;

// TYPE CASTING - external
int employeeCheck1 = (int) (Math.floor(Math.random()*10)%3);
System.out.println("integer generated - "+employeeCheck1);

/*
* Switch Case
*/
switch(employeeCheck1)
{
case Full_Time :
	System.out.println("Employee is full time");
	totalHours=8;
	break;
case Part_Time:
	System.out.println("Employee is part time");
	totalHours=4;
	break;
default :
	System.out.println("employee absent");
	break;
		}

//Using while Loop Check total working hours or days is reached for a month
while(totalHours <  Max_Hrs_In_Month && totalDays < WorkingDay_Per_Month)
	{
		totalHours+=1;
		totalDays+=1;
		int DailyWage=totalHours*totalDays*Wage_Per_Hour;
		System.out.println("Wage is:"+DailyWage);
		
	}	}
}
