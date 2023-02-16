package MiniGame1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameUI {
    public static void main(String[] args) {
        GameUI gui = new GameUI();
        Player player = new Player();
        Scanner input = new Scanner(System.in);
        String dir;
        Exit exit = new Exit();

        player.setLocation(0);

        ArrayList<Rooms> rooms = gui.readFile("Rooms.txt");  //invoking method to read text file

        //while (true)
        do {

            System.out.println(rooms.get(player.location).getRoomNum());
            //System.out.println(rooms.get(player.location).getRoomName());

            if (rooms.get(player.location).isVisited()) {
                System.out.println("You are visitng the " + rooms.get(player.location).getRoomName() + " again");
            } else {
                System.out.println("You are in the " + rooms.get(player.location).getRoomName() + " room");
                rooms.get(player.location).setVisited(true);
            }
            System.out.println(rooms.get(player.location).getRoomDescription());
            System.out.println(rooms.get(player.location).getExits());


            while (true) {
                System.out.println();
                dir = input.nextLine();

                if (gui.getNavigation().contains(dir.toLowerCase())) {
                    //exit.setDirection(dir);
                    player.move(dir, rooms); //calling move method from player
                    break;
                }
                else if (dir.equalsIgnoreCase("Quit") || dir.equalsIgnoreCase("q")) {
                    System.out.println("Game ended. Thank you for playing! :)");
                    break;
                }
            }

            if (dir.equalsIgnoreCase("Quit") || dir.equalsIgnoreCase("q")) {
                break;
            }

        } while(true);
    }



    public ArrayList<Rooms> readFile(String fileName) {   //method to read the file
        ArrayList<Rooms> rooms = new ArrayList<>();

        File roomFile = new File(fileName);

        try {
            Scanner readFile = new Scanner(roomFile);

            while (readFile.hasNext()) {

                String roomNum = readFile.nextLine();
                String roomName = readFile.nextLine();
                ArrayList<String> roomDescription = new ArrayList<>();
                ArrayList<Exit> exits = new ArrayList<>();

                Rooms room = new Rooms(roomNum, roomName, roomDescription, exits);

                String line = readFile.nextLine();  //reading the File to read the room and adding the descriptions into roomDescription arraylist
                while (!line.equals("----------")) {
                    room.roomDescription.add(line);
                    line = readFile.nextLine();
                }

                while (readFile.hasNextLine() && !(line = readFile.nextLine()).equals("----------")) {
                    //String[] info = line.split(" ");
                    String direction = line.split(" ")[0];             //splitting the direction (e.g."SOUTH") & destination
                    int destination = Integer.parseInt(line.split(" ")[1]);
                    exits.add(new Exit(direction, destination));            //adding direction and destination to exits arraylist

                }

                room.setExits(exits);  //setting exits to exits arraylist
                rooms.add(room); //adding each description into rooms arraylist
            }


            readFile.close();

        } catch (
                FileNotFoundException e) {
            System.err.println("File not found. Try another file name.");
            e.printStackTrace();
        }
        return rooms;
    }


    public ArrayList<String> getNavigation() {      //method to add directions to an arraylist
        ArrayList<String> navigation = new ArrayList<>();

        navigation.add("north");
        navigation.add("south");
        navigation.add("east");
        navigation.add("west");


        return navigation;

    }
}