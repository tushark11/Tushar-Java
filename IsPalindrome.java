class IsPalindrome {
    public boolean isPalindrome(int x) 
       {
        int og=x;
        int rev=0;

       if(x<0)
       {
       return false;    
       }
       while(x!=0)
       {
        int digit=x%10;
        rev=rev*10+digit;
        x=x/10;  //also can be written as  x/=10;
       
       }

       return rev==og;
       
      
    }
    public static void main(String [] args)
    {
        IsPalindrome s=new IsPalindrome();
       
        System.out.println(s.isPalindrome(12451)); // true
    }
}