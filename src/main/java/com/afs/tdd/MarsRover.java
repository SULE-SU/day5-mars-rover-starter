package com.afs.tdd;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MarsRover {
    private int x;
    private int y;
    private String direction;

    private static final Map<String, Command> COMMAND_MAP = new HashMap<>();

    static {
        COMMAND_MAP.put("M", new MoveCommand());
        COMMAND_MAP.put("L", new TurnLeftCommand());
        COMMAND_MAP.put("R", new TurnRightCommand());
        COMMAND_MAP.put("B", new MoveBackwardCommand());
    }


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

    public void moveBackward() {
        switch (direction) {
            case "N":
                y--;
                break;
            case "S":
                y++;
                break;
            case "E":
                x--;
                break;
            case "W":
                x++;
                break;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "W":
                direction = "S";
                break;
            case "S":
                direction = "E";
                break;
            case "E":
                direction = "N";
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "E":
                direction = "S";
                break;
            case "S":
                direction = "W";
                break;
            case "W":
                direction = "N";
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
