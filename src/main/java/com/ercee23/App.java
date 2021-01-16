package com.ercee23;

import com.ercee23.Device.Rover;
import com.ercee23.Directions.Direction;
import com.ercee23.Directions.DirectionFactory;
import com.ercee23.Map.Map;
import com.ercee23.Moves.Move;
import com.ercee23.Moves.MoveFactory;
import com.sun.istack.internal.NotNull;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;


public class App 
{
    static BufferedReader reader;
    static DirectionFactory directionFactory;
    static MoveFactory moveFactory;
    static ArrayList<Rover> rovers;

    public static void main( String[] args ) throws Exception {

        directionFactory = new DirectionFactory();
        moveFactory = new MoveFactory();
        rovers = new ArrayList<>();

        getReader(args);
        parseHeader();
        parseRovers();
        moveRovers();
        printResult();
    }

    public static void getReader(String[] args) throws FileNotFoundException {
        String txtName = "input.txt";
        if (args != null && args.length > 0) {
            txtName = args[0];
        }
        reader = new BufferedReader(new FileReader(txtName));
    }

    public static void parseHeader() throws Exception {
        String[] line = reader.readLine().split(" ");
        int xcoord = Integer.parseInt(line[0]);
        int ycoord = Integer.parseInt(line[1]);
        Map.getMap(xcoord, ycoord);
    }

    public static void parseRovers() throws Exception {
        String line = reader.readLine();
        while (line != null) {
            String[] firstLine = line.split(" ");
            Coordinate coordinate = new Coordinate(Integer.parseInt(firstLine[0]), Integer.parseInt(firstLine[1]));
            Direction direction = directionFactory.getDirection(firstLine[2].charAt(0));
            line = reader.readLine();
            char[] moveKeys = line.toCharArray();
            ArrayList<Move> moves = new ArrayList<>();
            for (char moveKey: moveKeys) {
                Move move = moveFactory.getMove(moveKey);
                moves.add(move);
            }
            Rover rover = new Rover(coordinate, direction, moves);
            rovers.add(rover);
            line = reader.readLine();
        }
    }

    public static void moveRovers() {
        rovers.forEach(Rover::start);
    }

    public static void printResult() {
        rovers.forEach(System.out::println);
    }
}
