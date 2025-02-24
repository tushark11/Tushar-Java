class VarArgs {
    public static void m(int... x) {
        System.out.println("var args method");
    }
public static void main(String[] args)
{
    m();
    m(10);
    m(10, 20);
    m(10, 20, 30);
}
}