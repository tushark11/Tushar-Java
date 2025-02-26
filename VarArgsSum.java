class VarArgsSum {
    public static void sum(int... x) { 
        int total = 0;
        for (int i : x) {
            total += i;
        }
        System.out.println("Sum is : " + total);
    }

    public static void main(String[] args) {
        sum(10, 20);
        sum(10, 20, 30);
        sum(10, 20, 30, 40);
    }
}
