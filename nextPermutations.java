import java.util.Arrays;
class nextPermutations {
    int[] nextPermutation(int[] arr) {
        // code here
        int idx=-1;
        int n=arr.length;
        //to find the breaking or pivot point 
        for(int i=n-2;i>=0;i--)
        {
        
        if(arr[i]<arr[i+1])
        {
            idx=i;
            break;
        }
    }   
    // if no pivot is found then reverse the entire array
    if(idx==-1)
    {
        reverse(arr,0,n-1);
        return arr;
    }
//find the next greater element to swap with the pivot element
for(int i=n-1;i>idx;i--)
{
    if(arr[i]>arr[idx])
    {
        swap(arr,i,idx);
        break;
        
    }
}

//reverse the suffix after trhe pivot
reverse(arr,idx+1,n-1);
return arr;
}

//swap function
public void swap(int arr[],int i, int j)
{
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
//reverse function
public void reverse(int arr[],int start, int end)

{
    while(start<end)
    {
        swap(arr,start,end);
        start++;
        end--;
        
    }
}
public static void main(String[] args)
{
    nextPermutations sol=new nextPermutations();
    int arr[]={2,3,6,8,1,0,0};
    arr=sol.nextPermutation(arr);
    System.out.println(Arrays.toString(arr));
}
}




