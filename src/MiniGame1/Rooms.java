package MiniGame1;

import java.util.ArrayList;

public class Rooms {
    private int roomNum;
    private String roomName;
    private String[] roomDescription;
    private boolean isVisited;
    private ArrayList<Exit> exits;

    public Rooms(int roomNum, String roomName, boolean isVisited) {
        this.roomNum = roomNum;
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.isVisited = false;
        this.exits = new ArrayList<Exit>();

    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String[] getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String[] roomDescription) {
        this.roomDescription = roomDescription;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }
}
