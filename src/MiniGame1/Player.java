package MiniGame1;

import java.util.ArrayList;

public class Player {
    private String name;
    private int location;

    public Player(){
        name = "Jane";
        location = 0;
    }

    public void move(String direction, ArrayList<Rooms> rooms){
        direction = direction.toLowerCase();
        Rooms current = rooms.get(location);

        //then you will need to work on exits and directions.  This is the
        // part you will either use if-else if -else if -else or switch-case.


    }
}
