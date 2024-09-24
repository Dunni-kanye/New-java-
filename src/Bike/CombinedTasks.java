package Bike;

public class CombinedTasks {
    public static int twiceTheSum(int x, int y) {
        return 2 * (x + y);
    }
    public static int addRemainderToOriginal(int value) {
         int remainder = value % 10;
         return value + remainder;
    }
    public static int multiplyTimes(int x, int n){
      int result = x;
      for(int index = 0; index < n; index++){
          result *= x;
      }
      return result;
    }
    public static double divideByProduct(int a) {
        int x = a + 10;
        int y = a - 10;
        int z = a % 10;
        int product = x * y * z;

        if(product == 0){
            throw new ArithmeticException("Divide by zero is not allowed");
        }
        return (double) a / product;

    }
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int task1Result = twiceTheSum(x, y);
        System.out.println("Task 1: Twice the sum of " + x + " and " + y + " is: " + task1Result);

        int n = 4;
        int task2Result = addRemainderToOriginal(10);
        System.out.println("Task 2: Original value: " + 10 + ", after adding remainder: " + task2Result);

        n = 4;
        int task3Result = multiplyTimes(x, n);
        System.out.println("Task 3: " + x + " multiplied by itself " + n + " times is: " + task3Result);

        int a = 20;
        double task4Result = divideByProduct(a);
        System.out.println("Task 4: " + a + " divided by " + a + " is: " + task4Result);
    }


}
