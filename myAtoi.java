class myAtoi {
    public static int myAtoi(String s) 
    {
        // code here
     s=s.trim();//to remove the trailing white spaces
   if(s.length()==0)
   {
       return 0;
   }
      int sign=1;
      int i=0;
      int result=0;
      //check for the sign - or +
      if(s.charAt(i)=='-')
      {
       sign=-1;
       i++;
      }
      else if(s.charAt(i)=='+')
      {
          i++;
      }
      //convert the digits to number
      while(i<s.length() && s.charAt(i)>='0'&& s.charAt(i)<='9')
      {
          if(result>Integer.MAX_VALUE/10||(result==Integer.MAX_VALUE/10 && s.charAt(i)-'0'>7 ))
          {
              return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
          }
          result=result*10+(s.charAt(i)-'0');
          i++;
      }
      return result*sign;
    }
    public static void main(String []args)
    {
        System.out.println(myAtoi("     -11"));
        System.out.println(myAtoi("qw234"));
    }
}