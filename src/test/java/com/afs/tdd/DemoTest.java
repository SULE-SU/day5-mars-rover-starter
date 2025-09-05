package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    public void should_return_y_plus_when_input_commend_M(){
        String commands = "M";

        MarsRover marsRover = new MarsRover(0, 0,"N");
        marsRover.executeCommands(commands);

        assertEquals(0, marsRover.getY());
    }


}
