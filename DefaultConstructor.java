class DefaultConstructor
{
int i;
String str;
DefaultConstructor()
{
System.out.println("Default constructor called");
System.out.println(i+" "+str);

}
public static void main(String [] args)
{
DefaultConstructor d=new DefaultConstructor();
System.out.println("---MAIN METHOD---");


}
}