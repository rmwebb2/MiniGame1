package MiniGame1;

public class Exit {
    private String direction;
    private int destination;

    public Exit() {

    }

    public Exit(String direction, int destination) {
        this.direction = direction;
        this.destination = destination;
    }

    public String getDirection() {
        return direction;
    }

    public int getDestination() {
        return destination;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return direction + " " + destination;
    }
}