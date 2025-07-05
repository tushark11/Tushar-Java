class maxProduct {
   public static int maxProduct(int[] arr) {
        // code here
       int  currMax=arr[0];
        int currMin=arr[0];
        int maxProd=arr[0];
        int n=arr.length;
        
        for(int i=1;i<n;i++)
        {
          int temp=Math.max(arr[i],Math.max(arr[i]*currMax,arr[i]*currMin));
          currMin=Math.min(arr[i],Math.min(arr[i]*currMax,arr[i]*currMin));
          currMax=temp;
          maxProd=Math.max(maxProd,currMax);
        }
        
          return maxProd;
        
    }
    public static void main(String []args)
    {
        int[]arr={2,8};
        System.out.println("Maximum product of the subarray is :"+maxProduct(arr));
    }
    
}