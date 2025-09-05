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

    @Test
    public void should_return_coordinates_when_input_commend_M_direction_W(){
        String commands = "M";

        MarsRover marsRover = new MarsRover(0, 0,"W");
        marsRover.executeCommands(commands);

        assertEquals(-1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_coordinates_when_input_commend_M_direction_E(){
        String commands = "M";

        MarsRover marsRover = new MarsRover(0, 0,"E");
        marsRover.executeCommands(commands);

        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("E", marsRover.getDirection());

    }

    @Test
    public void should_return_coordinates_when_input_commend_L_direction_N(){
        String commands = "L";

        MarsRover marsRover = new MarsRover(0, 0,"N");
        marsRover.executeCommands(commands);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("W", marsRover.getDirection());

    }

    @Test
    public void should_return_coordinates_when_input_commend_L_direction_S(){
        String commands = "L";

        MarsRover marsRover = new MarsRover(0, 0,"S");
        marsRover.executeCommands(commands);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("E", marsRover.getDirection());

    }

    @Test
    public void should_return_coordinates_when_input_commend_L_direction_W(){
        String commands = "L";

        MarsRover marsRover = new MarsRover(0, 0,"W");
        marsRover.executeCommands(commands);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("S", marsRover.getDirection());

    }

    @Test
    public void should_return_coordinates_when_input_commend_L_direction_E(){
        String commands = "L";

        MarsRover marsRover = new MarsRover(0, 0,"W");
        marsRover.executeCommands(commands);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("S", marsRover.getDirection());

    }

    @Test
    public void should_return_coordinates_when_input_commend_R_direction_N(){
        String commands = "R";

        MarsRover marsRover = new MarsRover(0, 0,"N");
        marsRover.executeCommands(commands);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("E", marsRover.getDirection());

    }
    @Test
    public void should_return_coordinates_when_input_commend_R_direction_S(){
        String commands = "R";

        MarsRover marsRover = new MarsRover(0, 0,"S");
        marsRover.executeCommands(commands);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_coordinates_when_input_commend_R_direction_W(){
        String commands = "R";

        MarsRover marsRover = new MarsRover(0, 0,"W");
        marsRover.executeCommands(commands);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_coordinates_when_input_commend_R_direction_E(){
        String commands = "R";

        MarsRover marsRover = new MarsRover(0, 0,"E");
        marsRover.executeCommands(commands);

        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }


}
