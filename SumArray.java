class SumArray {
   public static void main(String[] args) {
       // Pass the array and get the sum
       int sum = sum(new int[]{1, 2, 3, 4, 5});
       System.out.println("Sum of array is: " + sum);
   }

   public static int sum(int[] x) {
       int total = 0; // Initialize total
       for (int x1 : x) { // Loop through the array
           total = total + x1;
       }
       return total; // Return the total sum
   }
}
