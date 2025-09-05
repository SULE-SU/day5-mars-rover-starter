package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    public void should_return_coordinates_when_input_commend_M_direction_N(){
        String commands = "M";

        MarsRover marsRover = new MarsRover(0, 0,"N");
        marsRover.executeCommands(commands);

        assertEquals(0, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("N", marsRover.getDirection());

    }

    @Test
    public void should_return_coordinates_when_input_commend_M_direction_S(){
        String commands = "M";

        MarsRover marsRover = new MarsRover(0, 0,"S");
        marsRover.executeCommands(commands);

        assertEquals(0, marsRover.getX());
        assertEquals(-1, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }


}
