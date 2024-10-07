package Bike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ThreeByThreeTest {
    @Test
    public void testThatZeroExists (){
        var three = new ThreeByThree();
        int[][] array = {{1,1,0},{0,1,0},{1,1,0}};
        String[][] result = {{"*","*"," "},{" ","*"," "},{"*","*"," "}};
        assertArrayEquals(result,three.gret(array));
    }
}

