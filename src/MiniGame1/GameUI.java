package MiniGame1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameUI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File roomFile = new File("Rooms.txt");
        Scanner fileReader;


        //(1)  read file and retrieve/print file
        try {
            fileReader = new Scanner(roomFile);

            while (fileReader.hasNextLine()) {
                String file = fileReader.nextLine();
                System.out.println(file);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist. Please try new file name.");
            return;
        }


        //(2)you will need to store each line accordingly. You can take this
        // part and create a readFile() method --> including above.
        //I will start to write here briefly and you will complete.
        while(fileReader.hasNext()){


            String roomNumber = fileReader.nextLine();
            String roomName = fileReader.nextLine();
            String description = fileReader.nextLine();
            //you will need to let the iteration staps, if the description
            // retrieves "-----------" dashse.

            String exits = fileReader.nextLine();
            //based on the way how to count the exits, you can retrieve the
            // exit line and split by " " or any delimiter.

            //Then, you will need to add the actual parameter for the Room
            // type objects. Based on the constructor format you created in
            // the Rooms.java
            //Rooms(int roomNum, String roomName, boolean isVisited)
            //for example: Room rList = new Room(roomNum, roomName,
            // isVisited)  --> if you see this line, then you will need to
            // think to change String roomNumber = fileReader.nextLine();
            // into int value.   like int roomNumber = Integer.parseInt
            // (fileReader.nextLine());
            // Since you created the Rooms by taking roomNumber, roomName,
            // and isVisited parameters, you will need to revise Rooms.txt by
            // adding true or false for isVisited variable.
        }

            //then, provide prompts by asking questions and instructions. And
        // you will also write how to start and when to end the game.
    }
}
