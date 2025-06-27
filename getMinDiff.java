// User function Template for Java
import java.util.*;

class getMinDiff 
{
        // code here
        public static int getMinDiff(int [] arr,int k)
        {
            int n=arr.length;
            Arrays.sort(arr);
            
            int res=arr[n-1]-arr[0];
            
            for(int i =1;i<arr.length;i++)
            {
                if(arr[i]-k<0)
                continue;
                int minH=Math.min(arr[0]+k,arr[i]-k);
                int maxH=Math.max(arr[i-1]+k,arr[n-1]-k);
                res=Math.min(res,maxH-minH);
                
            }
            return res;
        }
        public static void main(String [] args)
        {
        Scanner sc=new Scanner(System.in);
            
         System.out.println("Enter the value of k:");
         int k=sc.nextInt();
         
         System.out.println("Enter the number of towers:");
         int n=sc.nextInt();
         int []arr=new int[n];
         System.out.println("Enter the heights of the towers:");
         
         for(int i=0;i<n;i++)
         {
           arr[i]=sc.nextInt();
         }
         
         int ans=getMinDiff(arr,k);
         System.out.println(ans);
        }
    }

