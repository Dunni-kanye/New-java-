package Bike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinedTasksTest {
    @Test
    public void testTwiceTheSum (){
        CombinedTasks combinedTasks = new CombinedTasks();
        assertEquals(24,combinedTasks.twiceTheSum(5,7));

    }
}
