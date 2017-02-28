package codility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akhil on 1/2/17.
 */
public class Battleship {

    public String solution(int N, String S, String T) {

        return solve(N, S,T);
    }

    private String solve(int boardSize, String ships, String hits) {

        /*
         * Expand ships to List of ship
           Each ship has upto fours positions and flag with isHit or miss
         */

        List<Ship> shipList = expandShips(ships);


        return null;
    }

    private List<Ship> expandShips(String ships) {
        String[] shipArr = ships.split(",");
        ArrayList<Ship> shipArrayList = new ArrayList<>();
        for (int i = 0; i < shipArr.length; i++) {
            String[] position = shipArr[i].split(" ");
            Ship ship = makeShip(position);
            shipArrayList.add(ship);
        }
        return shipArrayList;
    }

    private Ship makeShip(String[] position) {
        Ship ship = new Ship();
        String topLeft = position[0];
        String bottomRight = position[1];


        int topLeftNum = Integer.parseInt(topLeft.substring(0,topLeft.length()-1));
        char topLeftChar = topLeft.substring(topLeft.length() - 1).charAt(0);

        int bottomRightNum = Integer.parseInt(bottomRight.substring(0,bottomRight.length()-1));
        char bottomRightChar = bottomRight.substring(bottomRight.length() - 1).charAt(0);

        if(topLeftNum - bottomRightNum == 0) {
            ship.points.add(new Point(topLeft));

            int vgap = bottomRightChar - topLeftChar;
            for (int i = 1; i < vgap; i++) {
                String pos = String.format("%d%c", topLeftNum, topLeftChar+i);
                ship.points.add(new Point(pos));
            }

        } else if(topLeftNum - bottomRightNum == -1) {
            ship.points.add(new Point(topLeft));
            int vgap = bottomRightChar - topLeftChar;
            if(vgap == 0) {
                for (int i = topLeftNum; i < bottomRightNum; i++) {
                    String pos = String.format("%d%c", topLeftNum + i, topLeftChar);
                    ship.points.add(new Point(pos));
                }
            } else if(vgap == 1) {
                String pos2 = String.format("%d%c", topLeftNum + 1, topLeftChar);
                String pos3 = String.format("%d%c", topLeftNum, topLeftChar+1);
                String pos4 = String.format("%d%c", topLeftNum + 1, topLeftChar+1);
                ship.points.add(new Point(pos2));
                ship.points.add(new Point(pos3));
                ship.points.add(new Point(pos4));
            }

        } else if(topLeftNum - bottomRightNum <= -2) {
            ship.points.add(new Point(topLeft));
            for (int i = topLeftNum; i < bottomRightNum; i++) {
                String pos = String.format("%d%c", topLeftNum + i, topLeftChar);
                ship.points.add(new Point(pos));
            }
        }



        return ship;
    }


    private static class Ship {
        List<Point> points = new ArrayList<>(4);
        int hits = 0;
    }

    private static class Point {
        String pos;
        boolean isHit;

        Point(String _pos) {
            pos = _pos;
            isHit = false;
        }
    }
}
