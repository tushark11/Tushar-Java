import java.util.*;
class maximumProfit
{
    public static int maximumProfit(int prices[])
    {
        // Code here
        if(prices.length==0)
        {
            return 0;
        }
        int minprice=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<minprice)
            {
                minprice=prices[i];//update the minimum price
                
            }
            else
            {
                maxprofit=Math.max(maxprofit,prices[i]-minprice);
            }
        }
        return maxprofit;    
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of days:");
        int n=sc.nextInt();
        
        int[]prices=new int[n];
        System.out.println("Enter the stock prices:");
        for(int i=0;i<n;i++)
        {
            prices[i]=sc.nextInt();
        }
        int result=maximumProfit(prices);
        System.out.println("MAXIMUM PEROFIT:" +result);
    }
}