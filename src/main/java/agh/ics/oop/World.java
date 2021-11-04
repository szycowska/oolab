package agh.ics.oop;


public class World {
    public static void main(String[] args) {
        //System.out.print("Start\n");
        //Direction[] direction_table = convert_letters_to_directions(args);
        //run(direction_table);
        //System.out.print("Stop");

        Vector2d position1 = new Vector2d(1,2);
        System.out.println(position1);
        Vector2d position2 = new Vector2d(-2,1);
        System.out.println(position2);
        System.out.println(position1.add(position2));

        System.out.println(MapDirection.NORTH.toString());
        System.out.println(MapDirection.NORTH.next());
        System.out.println(MapDirection.NORTH.previous());
        System.out.println(MapDirection.NORTH.toUnitVector());
    }

    private static Direction[] convert_letters_to_directions(String[] args) {
        Direction[] direction_table = new Direction[args.length];
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            switch (arg) {
                case "f":
                    direction_table[i] = Direction.FORWARD;
                    break;
                case "b":
                    direction_table[i] = Direction.BACKWARD;
                    break;
                case "r":
                    direction_table[i] = Direction.RIGHT;
                    break;
                case "l":
                    direction_table[i] = Direction.LEFT;
                    break;
                default:
                    break;
            }
        }
        return direction_table;
    }

    private static void run(Direction [] args) {
        for(Direction argument : args) {
            switch (argument) {
                case FORWARD:
                    System.out.println("Zwierzak idzie do przodu");
                    break;
                case BACKWARD:
                    System.out.println("Zwierzak idzie do tyłu");
                    break;
                case RIGHT:
                    System.out.println("Zwierzak idzie w prawo");
                    break;
                case LEFT:
                    System.out.println("Zwierzak idzie w lewo");
                    break;
                default:
                    System.out.println("Zwierzak nie wie gdzie isc, podales zly kierunek");
                    break;
            }
        }
    }


}
