package com.afs.tdd;

public class TurnRightCommand implements Command {
    @Override
    public void execute(MarsRover rover) {
        rover.turnRight();
    }
}
