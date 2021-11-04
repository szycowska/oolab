package agh.ics.oop;

public class Vector2d {
    public final int x;
    public final int y;

    public Vector2d(int x, int y){
        this.x =x;
        this.y=y;
    }

    public  String toString()
    {
        return "("+x+","+y+")";
    }
    public boolean precedes(Vector2d other){
        if (this.x <= other.x && y <= other.y)
            return true;
        else return false;
    }

    public boolean follows(Vector2d other){
        return this.x >= other.x && y >= other.y;
    }
    public Vector2d upperRight(Vector2d other){

        int greaterX = other.x > x ? other.x : x;
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
