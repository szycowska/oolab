import agh.ics.oop.MapDirection;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MapDirectionTest {

    //Zaimplementuj test weryfikujący poprawność działania metody next(),
// dla wszystkich przypadków (dodaj anotację @Test przed deklaracją metody).
    @Test
    public void next(){
        MapDirection next_Direction = MapDirection.EAST.next();
        Assertions.assertEquals(next_Direction,MapDirection.SOUTH);
        next_Direction = next_Direction.next();
        Assertions.assertEquals(next_Direction,MapDirection.WEST);
        next_Direction = next_Direction.next();
        Assertions.assertEquals(next_Direction,MapDirection.NORTH);
        next_Direction = next_Direction.next();
        Assertions.assertEquals(next_Direction,MapDirection.EAST);

    }
    //Zaimplementuj test weryfikujący poprawność działania metody previous(),
// dla wszystkich przypadków.
    @Test
    public void previous(){

        MapDirection previous_Direction =  MapDirection.EAST.previous();
        Assertions.assertEquals(previous_Direction,MapDirection.NORTH);
        previous_Direction = previous_Direction.previous();
        Assertions.assertEquals(previous_Direction,MapDirection.WEST);
        previous_Direction = previous_Direction.previous();
        Assertions.assertEquals(previous_Direction,MapDirection.SOUTH);
        previous_Direction = previous_Direction.previous();
        Assertions.assertEquals(previous_Direction,MapDirection.EAST);

    }

}
