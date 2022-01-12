package asssignments;
import java.util.Scanner;
public class Q3 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("How many employees you want to add");
	int num=sc.nextInt();
	Employee []e=new Employee[num];
	populate(e,sc);
	show(e);
	/*Employee []e=new Employee[2];
	e[0]=new Employee(1,"shiv",20000);
	e[1]=new Employee(1,"sss",40000);*/
	
}

private static void show(Employee[] e) {
	for(int i=0;i<e.length;i++)
	{
		System.out.println(e[i]);
	}
}

private static void populate(Employee[] e,Scanner sc ){
	for(int i=0;i<e.length;i++)
	{
		System.out.println("Please enter id");
		int id=sc.nextInt();
		System.out.println("Please enter sallary");
		int salary=sc.nextInt();
		System.out.println("Please enter name");
		String name=sc.nextLine();
		
		 e[i]=new Employee(id,name,salary);
	}
	
}
}
