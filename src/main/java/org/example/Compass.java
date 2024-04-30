package org.example;

public class Compass {
    public enum Point {
        NORTH, EAST, SOUTH, WEST
    }

    public enum Direction {
        LEFT, RIGHT
    }

    private Point point;

    public static Point rotate(Point point, Direction direction) {
        int movement;
        int index;

        if (direction == Direction.RIGHT) {
            movement = 1;
        }else {
            movement = -1;
        }

        Point[] points = Point.values();
        // NORTH, EAST, SOUTH, WEST

        // forward
        index = (point.ordinal() + movement) % points.length;

        // move backward
        index = (point.ordinal() - movement + points.length) % points.length;


        return points[index];
    }
}
