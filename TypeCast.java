class TypeCast{
    public static void main(String[] args)
    {
        byte b;
        int i = 257;
        double d = 123.123;
        System.out.println("\n conversion of int to byte\n");
        b = (byte) i;
        System.out.println("i and b"+ i +" "+ b);


        System.out.println("\n conversion of double to int");
        i = (int) d;
        System.out.println("\nd and i "+ d +" "+i);

        System.out.println("\n conversion of int to double");
        d = (double) i;
        System.out.println("\ni and d"+ i +" "+ d);

    }
}