import agh.ics.oop.MapDirection;
import agh.ics.oop.Vector2d;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Vector2dTest {
    Vector2d positions1 = new Vector2d(2,6);
    Vector2d positions2 = new Vector2d(-6,-3);

    //test weryfikujacy poprawnosc metody equals(Object other)
//metoda ta zwraca prawdę jeśli obie pozycje są sobie równe (zwróć uwagę na typ parametru)
    @Test
    public void equalsTest(){
        Vector2d positions3 = new Vector2d(-6,-3);
        Assertions.assertFalse(positions1.equals(positions2));
        Assertions.assertTrue(positions3.equals(positions2));
    }
    //test weryfikujacy poprawnosc metody toString()
//metoda ta zamienia pozycję na napis (x,y),np. dla x = 1 oraz y = 2, napis ma postać (1,2)
    @Test
    public void toStringTest(){
        Assertions.assertEquals(positions1.toString(), "(2,6)");
        Assertions.assertEquals(positions2.toString(), "(-6,-3)");
    }
    //test weryfikujacy poprawnosc metody procedes(Vector2d other),
//metoda ta akceptującą inny obiekt tej klasy i zwracającą wartość true, jeśli oba pola
//mają wartość mniejszą bądź równą polom drugiego obiektu,
    @Test
    public void precedesTest(){
        Vector2d positions3 = new Vector2d(8,10);
        Vector2d positions4 = new Vector2d(0,0);
        Assertions.assertTrue(positions1.precedes(positions3));
        Assertions.assertFalse(positions1.precedes(positions4));
    }
    //test weryfikujacy poprawnosc metody follows(Vector2d other),
// akceptującą inny obiekt tej klasy i zwracającą wartość true, jeśli oba pola
//mają wartość większą bądź równą polom drugiego obiektu,
    @Test
    public void followsTest(){
        Vector2d positions3 = new Vector2d(1,5);
        Vector2d positions4 = new Vector2d(10,22);
        Assertions.assertTrue(positions1.follows(positions3));
        Assertions.assertFalse(positions1.follows(positions4));
    }

    //test weryfikujacy poprawnosc metody upperRight(Vector2d other), ktora
//która akceptuje inny punkt i zwraca obiekt klasy Vector2d posiadający te składowe punktów,
//które mają większe wartości dla odpowiednich osi (innymi słowy jest prawym górnym rogiem
//prostokąta, który opisany jest na obu punktach, którego krawędzie są równoległe do osi X i Y)
    @Test
    public void upperRightTest(){
        Vector2d positions3 = positions1.upperRight(positions2);
        Assertions.assertEquals("(2,6)", positions3.toString());
    }

    //test weryfikujacy poprawnosc metody lowerLeft(Vector2d other), ktora
//akceptuje inny punkt i zwraca obiekt klasy Vector2d posiadający te składowe punktów,
// które mają mniejsze wartości dla odpowiednich osi (tzn. lewy dolny róg prostokąta)
    @Test
    public void lowerLeftTest(){
        Vector2d positions3 = positions1.lowerLeft(positions2);
        Assertions.assertEquals("(-6,-3)", positions3.toString());
    }
    //test weryfikujacy poprawnosc metody add(Vector2d other), ktora dodaje dwa wektory
    @Test
    public void addTest(){
        Vector2d positions3 = positions1.add(positions2);
        Assertions.assertEquals("(-4,3)",positions3.toString());
    }
    //test weryfikujacy poprawnosc metody subtract(Vector2d other), ktora odejmuje dwa wektory
    @Test
    public void subtractTest(){
        Vector2d positions3 = positions1.subtract(positions2);
        Assertions.assertEquals("(8,-9)",positions3.toString());
    }
    //test weryfikujacy poprawnosc metody opposite() zwracajacej wektor przeciwny do podanego
    @Test
    public void oppositeTest(){
        Vector2d positions3 = positions1.opposite();
        Assertions.assertEquals("(-2,-6)",positions3.toString());
    }
}
