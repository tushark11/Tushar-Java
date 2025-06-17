import java.util.Arrays;


class ReverseTheArray
{
    public void reverseArray(int arr[]) 
    {
      
      int i;
      int j=arr.length;
      for(i=0;i<j/2;i++)
      {
         
          
             int temp=arr[i];
              arr[i]=arr[j-1-i];
              arr[j-1-i]=temp;
        
          
      }
      
    }
    public static void main(String[] args)
    {
      int arr[]={1, 2, 3, 4, 5};  
      ReverseTheArray sol=new ReverseTheArray();
     
      sol.reverseArray(arr);
      System.out.println(Arrays.toString(arr));
    }
     
}