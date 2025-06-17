import java.util.Arrays;
class ZerosToEnd {
    void pushZerosToEnd(int[] arr) {
     
        int n=arr.length;
        int j=0;// it is a pointer to place the next non zero element
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               j++;
               
               
            }
          
            
        }
        
    }
    public static void main(String[] args)
    {
        ZerosToEnd sol= new ZerosToEnd();
        int arr[]={1,0,2,0,3,0,4,0,5};
        sol.pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));//to convert the array human readable form.
    }
}