package Bike;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Practice {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Point point1 = new Point();
        Point point2 = point1;
        point1.x =2;
        point1.y =3;
        System.out.println(point2);

        String message = "Hello World" + "!!";
        System.out.println(message.indexOf("e"));
        System.out.println(message.replace("!", "*"));
        System.out.println(message.toLowerCase());

        int [][] numbers = new int [2][3];
        numbers[0][2] = 3;
        System.out.println(Arrays.deepToString(numbers));

    }
}
