package agh.ics.oop;
//Utwórz typ wyliczeniowy MapDirection z czterema kierunkami: NORTH, SOUTH, WEST, EAST,
public enum MapDirection {
    NORTH,
    SOUTH,
    WEST,
    EAST;

//posiada metodę toString, która dla kierunku EAST zwraca łańcuch Wschód,
// dla WEST - Zachód, itd.
    public String toString(){
        switch (this){
            case NORTH: return "Północ";
            case SOUTH: return "Południe";
            case EAST: return "Wschód";
            case WEST: return "Zachód";
        }
        return "";
    }

//posiada metodę next, która dla kierunku EAST zwraca SOUTH (kolejny
// kierunek zgodnie z ruchem wskazówek zegara),
    public MapDirection next(){
        switch (this){
            case NORTH: return EAST;
            case SOUTH: return WEST;
            case EAST: return SOUTH;
            case WEST: return NORTH;
        }
        throw new Error();
    }

//posiada metodę previous, która dla kierunku EAST zwraca NORTH (kolejny
// kierunek zgodnie z ruchem przeciwnym do ruchu wskazówek zegara), itd.
    public MapDirection previous() {
        switch (this) {
            case NORTH: return WEST;
            case SOUTH: return EAST;
            case EAST: return NORTH;
            case WEST: return SOUTH;
        }
        throw new Error();
    }

//posiada metodę toUnitVector, która zwraca jednostkowy wektor przemieszczenia
// typu Vector2d zgodny z orientacją na mapie, tzn. dla NORTH wektor ten powinien
// mieć wartość (0,1), dla EAST (1,0), itd.
    public Vector2d toUnitVector(){
        switch (this) {
            case NORTH: return new Vector2d(0,1);
            case SOUTH: return new Vector2d(0,-1);
            case EAST: return new Vector2d(1,0);
            case WEST: return new Vector2d(-1,0);
        }
        throw new Error();
    }
}

