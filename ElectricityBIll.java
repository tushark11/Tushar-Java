package if_else;
import java.util.*;
public class ElectricityBIll {

	public static void main(String[] args) {

		System.out.println("ENTER THE BILL AMOUNT: ");
		
		Scanner sc= new Scanner(System.in);
		int units;
		int bill=sc.nextInt();
		
		if(bill>0 && bill<=30)
		{
			System.out.println("0 UNITS :NO ELECTRICTIY BILL");
		}
		else if(bill>=30 && bill<60)
		{
			System.out.println("5 UNITS ELECTRICITY");
			units=10;
			int totalAmt=bill*units;
			System.out.println("TOTAL AMOUNT:"+totalAmt);
		}
		else if(bill>60 && bill<80)
		{
			units=15;
			System.out.println("TOTAL AMOUNT:"+bill*units);
			
		}
		else if(bill>80 && bill<100)
		{
			units=20;
			System.out.println("TOTAL AMOUNT:"+bill*units);
			
		}
		
		sc.close();
	}
	
}
