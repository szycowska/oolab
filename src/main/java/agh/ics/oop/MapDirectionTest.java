import agh.ics.oop.MapDirection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapDirectionTest {
    @Test
    public void next(){
        MapDirection nextDirection = MapDirection.EAST.next();
        assertEquals(nextDirection,MapDirection.SOUTH);
        nextDirection = nextDirection.next();
        assertEquals(nextDirection,MapDirection.WEST);
        nextDirection = nextDirection.next();
        assertEquals(nextDirection,MapDirection.NORTH);
        nextDirection = nextDirection.next();
        assertEquals(nextDirection,MapDirection.EAST);

    }
    @Test
    public void previous(){

        MapDirection nextDirection =  MapDirection.EAST.previous();
        assertEquals(nextDirection,MapDirection.NORTH);
        nextDirection = nextDirection.previous();
        assertEquals(nextDirection,MapDirection.WEST);
        nextDirection = nextDirection.previous();
        assertEquals(nextDirection,MapDirection.SOUTH);
        nextDirection = nextDirection.previous();
        assertEquals(nextDirection,MapDirection.EAST);

    }

}
