import java.util.*;
class maxSubarraySum {
   public static int maxSubarraySum(int[] arr) {
        // Code here
        int res=arr[0];
        int maxEnding=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            maxEnding=Math.max(maxEnding+arr[i], arr[i]);
            res=Math.max(res,maxEnding);
        }
        return res;
    }
    public static void main (String[] args)
    {
        int[] arr={1,2,3,4,5};
        System.out.println("Maximum sum of subarray:"+maxSubarraySum(arr));
    }
    
    
}
