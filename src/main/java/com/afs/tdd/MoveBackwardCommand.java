package com.afs.tdd;


public class MoveBackwardCommand implements Command {
    @Override
    public void execute(MarsRover rover) {
        rover.moveBackward();
    }
}
