package com.afs.tdd;

import java.util.Objects;

public class MarsRover {
    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getY() {
        return y;
    }


    public int getX() {
        return x;
    }

    public String getDirection()  {
        return direction;
    }


    public void move() {
        switch (direction) {
            case "N":
                y++;
                break;
            case "S":
                y--;
                break;
            case "E":
                x++;
                break;
            case "W":
                x--;
                break;
        }
    }


    public void executeCommands(String commands) {
            switch (commands) {
                case "M":
                    move();
                    break;
                case "L":
                    turnLeft();
                    break;
                case "R":
                    turnRight();
                    break;
            }
    }


}
