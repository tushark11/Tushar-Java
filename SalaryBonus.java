package if_else;
import java.util.*;
public class SalaryBonus {

	public static void main(String[] args) {
		System.out.println("ENTER THE SALARY AMOUNT:");
		Scanner sc= new Scanner(System.in);
		int sal= sc.nextInt();
		if(sal>0 && sal<=25000)
		{
			int bonus=2000;
			int totalSal=bonus+sal;
			System.out.println("TOTAL SALARY:"+totalSal+"   BONUS:2000");
		}
		if(sal>25000 && sal<=50000)
		{
			int bonus=4000;
			int totalSal=bonus+sal;
			System.out.println("TOTAL SALARY:"+totalSal+"   BONUS:4000");
		}
		if(sal>50000 && sal<=100000)
		{
			int bonus=5000;
			int totalSal=bonus+sal;
			System.out.println("TOTAL SALARY:"+totalSal+"   BONUS:5000");
		}
	}
}
