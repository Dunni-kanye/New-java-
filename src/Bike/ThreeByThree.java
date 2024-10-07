package Bike;
import java.util.*;

public class ThreeByThree {

    public String[][]  gret (int[][] array) {
        String [][] boy = new String[array.length][array[0].length];
        for (int index = 0; index < array.length; index++) {
            for (int count = 0; count < array[index].length; count++) {
                if (array[index][count] == 1) {
                    boy[index][count] = "*";
                } else if (array[index][count] == 0) {
                    boy[index][count] = " ";
                }
            }
            System.out.println();
        }
        return boy;
    }

}


