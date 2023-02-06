package MiniGame1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameUI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File roomFile = new File("src/MiniGame1/Rooms.txt");
        Scanner fileReader;

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

    }
}
