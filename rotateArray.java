// User function Template for Java
import java.util.Arrays;
class rotateArray {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[],int d) 
    {
       int n=arr.length;
      
      d=d%n;//to handle the rotation if d>n
      
      
      if(d==0)
      return;
      
      reverse(arr,0,d-1);//to reverse first d elements
      reverse(arr,d,n-1);//to reverse elements after d
      reverse(arr,0,n-1);//to reverse whole elements of the array
    }
    
    static void reverse(int arr[],int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }


public static void main(String[] args)
{
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    int d=4;
    rotateArray sol=new rotateArray();
    sol.rotateArr(arr,d);
    System.out.println(Arrays.toString(arr));
    
}
}