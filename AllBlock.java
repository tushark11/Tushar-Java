class AllBlock{
public void add()
{
System.out.printlfn("---add method called");
}


public void m1()
{
System.out.println("---m1 method called---");
}

public static void main(String[] args)
{
AllBlock a=new AllBlock();
a.m1();
a.add();
}

}