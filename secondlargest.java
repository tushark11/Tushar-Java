class Solution {
    public int getSecondLargest(int arr[]) {
    
        
        int i,j;
       int secondlargest=Integer.MIN_VALUE;
       int largest=Integer.MIN_VALUE;
       
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
             secondlargest=largest;
            largest=arr[i];
        }
        else if(arr[i]>secondlargest&&arr[i]!=largest)
        {
           secondlargest=arr[i];
        }
        
        }
        if(secondlargest==Integer.MIN_VALUE)
        {
            return -1;
        }
        return secondlargest;
    }

    public static void main(String[] args)
        {
         Solution sol=new Solution();
            int arr[]={10,20,20,30};
        int result=sol.getSecondLargest(arr);
        System.out.println(result);
        }
}
