package agh.ics.oop;
//posiada dwa publiczne pola x i y typu int, które nie mogą być
// modyfikowane (final),
public class Vector2d {
    public final int x;
    public final int y;

//posiada konstruktor akceptujący parametry x i y, która są przypisywane
// do pól x i y,
    public Vector2d(int x, int y){
        this.x =x;
        this.y=y;
    }
//posiada metodę String toString(), która zamienia pozycję na napis (x,y),
// np. dla x = 1 oraz y = 2, napis ma postać (1,2)
    public  String toString()
    {
        return "("+x+","+y+")";
    }

//posiada metodę boolean precedes(Vector2d other), akceptującą inny obiekt
// tej klasy i zwracającą wartość true, jeśli oba pola mają wartość mniejszą
// bądź równą polom drugiego obiektu,
    public boolean precedes(Vector2d other){
        if (this.x <= other.x && y <= other.y)
            return true;
        else return false;
    }
//posiada metodę boolean follows(Vector2d other), akceptującą inny obiekt tej klasy
// i zwracającą wartość true, jeśli oba pola mają wartość większą bądź równą polom
// drugiego obiektu,
    public boolean follows(Vector2d other){
        if (this.x >= other.x && y >= other.y)
            return true;
        else return false;
    }

//posiada metodę Vector2d upperRight(Vector2d other), która akceptuje inny punkt
// i zwraca obiekt klasy Vector2d posiadający te składowe punktów, które mają
// większe wartości dla odpowiednich osi (innymi słowy jest prawym górnym rogiem
// prostokąta, który opisany jest na obu punktach, którego krawędzie są równoległe
// do osi X i Y)
    public Vector2d upperRight(Vector2d other){


        int greaterX;
        if(other.x > x){
            greaterX = other.x;
        }else{
            greaterX=x;
        }
// to jest to samo ale zapisane z uzyciem operator aelvisa presleja
        int greaterY;
        if(other.y > y){
            greaterY = other.y;
        }else{
            greaterY=y;
        }
        return new Vector2d(greaterX,greaterY);


    }

    public Vector2d lowerLeft(Vector2d other){

        int lowerX = other.x < x ? other.x : x;
        //if true przypisz other.x a w przeciwnym wypadku x
// to jest to samo ale zapisane z uzyciem operator aelvisa presleja
        int lowerY;
        if(other.y < y){
            lowerY = other.y;
        }else{
            lowerY=y;
        }
        return new Vector2d(lowerX, lowerY);
    }
    public Vector2d add(Vector2d other){

        int addX = x + other.x;
        int addY = y + other.y;
        return new Vector2d(addX, addY);
    }
    public Vector2d subtract(Vector2d other){

        int subX = x - other.x;
        int subY = y - other.y;
        return new Vector2d(subX, subY);
    }
    public boolean equals(Vector2d other){
        return x == other.x && y == other.y;
    }
    public Vector2d opposite(){
        return new Vector2d(x*-1, y*-1);
    }
}
