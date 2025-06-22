// User function Template for Java
import java.util.*;
class maxProfit {
    public static int maximumProfit(int prices[]) {
        // code here
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            {
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of days:");
int n=sc.nextInt();


int[]prices=new int[n];
System.out.println("Enter the stock prices:");

for(int i=0;i<n;i++)
{
    prices[i]=sc.nextInt();
    
}
int result=maximumProfit(prices);
System.out.println("maximum Porfit:"+result);
}
}