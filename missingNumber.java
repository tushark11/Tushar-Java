import java.util.*;
class missingNumber {
    public static int missingNumber(int[] arr) 
    {
        // code here
        Arrays.sort(arr);
        int res=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==res)
            {
                res++;
                
            }
            else if(arr[i]>res)
            {
                break;
            }
        }
        return res;
        
    }
    public static void main(String []args)
    {
        int[]arr={2,6,4,1,-7,5,9};
        System.out.println("missing number is :"+missingNumber(arr));
    }
    
    
}
