package Bike;

import java.util.Arrays;

public class DescendingOrder {

    public static int [] sortDescending(int[] numbers) {
        Arrays.sort(numbers);
        for (int index = 0; index < numbers.length / 2; index++) {
            int temporary = numbers[index];
            numbers[index] = numbers[numbers.length - 1 - index];
            numbers[numbers.length - 1 - index] = temporary;
        }
        return numbers;
    }
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(sortDescending(number)));

    }
}



