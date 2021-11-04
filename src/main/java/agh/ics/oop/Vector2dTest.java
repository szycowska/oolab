import agh.ics.oop.MapDirection;
import agh.ics.oop.Vector2d;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Vector2dTest {
    Vector2d positions1 = new Vector2d(1,5);
    Vector2d positions2 = new Vector2d(-3,6);
    @Test
    public void equalsTest(){
        Vector2d positions3 = new Vector2d(-3,6);
        Assertions.assertFalse(positions1.equals(positions2));
        assertTrue(positions3.equals(positions2));
    }
    @Test
    public void toStringTest(){
        assertEquals(positions1.toString(), "(1,5)");
    }
    @Test
    public void precedesTest(){
        Vector2d positions3 = new Vector2d(-3,7);
        Vector2d positions4 = new Vector2d(10,22);
        assertTrue(positions1.precedes(positions4));
        Assertions.assertFalse(positions3.precedes(positions2));
    }
    @Test
    public void followsTest(){
        Vector2d positions3 = new Vector2d(-3,6);
        Vector2d positions4 = new Vector2d(10,22);
        assertTrue(positions4.follows(positions1));
        Assertions.assertFalse(positions3.follows(positions4));
    }
    @Test
    public void upperRightTest(){
        Vector2d positions3 = positions1.upperRight(positions2);
        assertEquals("(1,6)", positions3.toString());
    }
    @Test
    public void lowerLeftTest(){
        Vector2d positions3 = positions1.lowerLeft(positions2);
        assertEquals("(-3,5)", positions3.toString());
    }
    @Test
    public void addTest(){
        Vector2d positions3 = positions1.add(positions2);
        assertEquals("(-2,11)",positions3.toString());
    }
    @Test
    public void subtractTest(){
        Vector2d positions3 = positions1.subtract(positions2);
        assertEquals("(4,-1)",positions3.toString());
    }
    @Test
    public void oppositeTest(){
        Vector2d positions3 = positions1.opposite();
        assertEquals("(-1,-5)",positions3.toString());
    }
}
